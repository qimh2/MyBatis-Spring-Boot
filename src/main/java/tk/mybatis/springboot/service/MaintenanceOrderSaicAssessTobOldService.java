package tk.mybatis.springboot.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.TbBookingAssessItemMapper;
import tk.mybatis.springboot.mapper.TbMaintenanceOrderSaicAssessTobOldMapper;
import tk.mybatis.springboot.model.TbBookingAssessItem;
import tk.mybatis.springboot.model.TbMaintenanceOrderSaicAssessTobOld;
import tk.mybatis.springboot.tmplate.AbstractSqlScriptTemplate;

import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class MaintenanceOrderSaicAssessTobOldService extends AbstractSqlScriptTemplate {

    @Autowired
    private TbMaintenanceOrderSaicAssessTobOldMapper tbMaintenanceOrderSaicAssessTobOldMapper;

    @Autowired
    private TbBookingAssessItemMapper tbBookingAssessItemMapper;

    {
        tableIndex = 3;
    }

    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    @Override
    public String generatorSqlScript() {
        //获取数据
        List<TbMaintenanceOrderSaicAssessTobOld> list = tbMaintenanceOrderSaicAssessTobOldMapper.selectAll();
        //生成文件
        saveSqlScriptFile(list, TbMaintenanceOrderSaicAssessTobOld.class, sourceTables[tableIndex]);
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
        List<TbBookingAssessItem> list = readSqlScriptFile(sourceTables[tableIndex], TbBookingAssessItem.class);
        //插入数据库
        list.parallelStream().forEach(element -> {
            tbBookingAssessItemMapper.insert(element);
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
            TbMaintenanceOrderSaicAssessTobOld pgcOld = (TbMaintenanceOrderSaicAssessTobOld) e;
            TbBookingAssessItem tbBookingAssessItem = new TbBookingAssessItem();
            BeanUtils.copyProperties(e, tbBookingAssessItem);
            //手动设置未匹配的字段
            try {
                tbBookingAssessItem.setLastUpdateDate(pgcOld.getUpdateTime());
                if ("N".equalsIgnoreCase(pgcOld.getDeleted())){
                    tbBookingAssessItem.setIsValid(true);
                }else{
                    tbBookingAssessItem.setIsValid(false);
                }
            } catch (Exception ex) {
                LOGGER.error("Exception:", ex);
                throw new RuntimeException(ex.getMessage());
            }

            LOGGER.info("TbMaintenanceOrderSaicAssessTobOld: {}", e);
            LOGGER.info("tbBookingAssessItem: {}", tbBookingAssessItem);
            jsonArray.add(tbBookingAssessItem);
        });
    }
}
