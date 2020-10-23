package tk.mybatis.springboot.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.util.StringUtil;
import tk.mybatis.springboot.mapper.TbPickGiveCarOrderMapper;
import tk.mybatis.springboot.mapper.TbPickGiveCarOrderOldMapper;
import tk.mybatis.springboot.model.TbPickGiveCarOrder;
import tk.mybatis.springboot.model.TbPickGiveCarOrderOld;
import tk.mybatis.springboot.tmplate.AbstractSqlScriptTemplate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class PickGiveCarOrderOldService extends AbstractSqlScriptTemplate {

    @Autowired
    private TbPickGiveCarOrderOldMapper tbPickGiveCarOrderOldMapper;
    @Autowired
    private TbPickGiveCarOrderMapper tbPickGiveCarOrderMapper;


    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    @Override
    public String generatorSqlScript() {
        //获取数据
        List<TbPickGiveCarOrderOld> list = tbPickGiveCarOrderOldMapper.selectAll();
        //生成文件
        saveSqlScriptFile(list, TbPickGiveCarOrderOld.class, sourceTables[0]);
        return "success";
    }

    /**
     * 解析sql Json文件
     *
     * @return
     */
    @Override
    public String analysisSqlScript() {
        //读取json文件内容
        List<TbPickGiveCarOrder> list = readSqlScriptFile(sourceTables[0], TbPickGiveCarOrder.class);
        //插入数据库
        list.parallelStream().forEach(element -> {
            tbPickGiveCarOrderMapper.insertRecord(element);
        });
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "success";
    }

    /**
     * 新旧表数据字段转换
     *
     * @param jsonArray
     * @param list
     * @param tClass
     */
    @Override
    public <T> void cleanData(JSONArray jsonArray, List<T> list, Class<T> tClass) {
        //转成目标库表字段
        list.parallelStream().forEach(e -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            TbPickGiveCarOrderOld pgcOld = (TbPickGiveCarOrderOld) e;
            TbPickGiveCarOrder tbPickGiveCarOrder = new TbPickGiveCarOrder();
            BeanUtils.copyProperties(e, tbPickGiveCarOrder);
            //手动设置未匹配的字段
            try {

                if (!StringUtil.isEmpty(pgcOld.getBusinessTime())) {
                    tbPickGiveCarOrder.setBusinessTime(sdf.parse(pgcOld.getBusinessTime()));
                }
                tbPickGiveCarOrder.setIsValid(true);
                if (StringUtil.isEmpty(pgcOld.getOrderStatus())) {
                    tbPickGiveCarOrder.setOrderStatus(Byte.parseByte(pgcOld.getOrderStatus()));
                }
                if (StringUtil.isEmpty(pgcOld.getOrderStatus())) {
                    tbPickGiveCarOrder.setOrderType(Byte.parseByte(pgcOld.getOrderStatus()));
                }
                if (!StringUtil.isEmpty(pgcOld.getPayMethod())) {
                    tbPickGiveCarOrder.setPayMethod(Byte.parseByte(pgcOld.getPayMethod()));
                }
                if (!StringUtil.isEmpty(pgcOld.getSalerTime())) {
                    tbPickGiveCarOrder.setSalerTime(sdf.parse(pgcOld.getSalerTime()));
                }
                if ("N".equalsIgnoreCase(pgcOld.getDeleted())){
                    tbPickGiveCarOrder.setIsValid(true);
                }else{
                    tbPickGiveCarOrder.setIsValid(false);
                }
            } catch (ParseException ex) {

                LOGGER.error("Exception:", ex);
                throw new RuntimeException(ex.getMessage());
            }

            LOGGER.info("TbPickGiveCarOrderOld: {}", e);
            LOGGER.info("tbPickGiveCarOrder: {}", tbPickGiveCarOrder);
            jsonArray.add(tbPickGiveCarOrder);
        });
    }
}
