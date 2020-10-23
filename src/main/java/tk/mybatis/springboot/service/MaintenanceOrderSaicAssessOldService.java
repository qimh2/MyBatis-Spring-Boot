package tk.mybatis.springboot.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.TbBookingAssessMapper;
import tk.mybatis.springboot.mapper.TbMaintenanceOrderSaicAssessOldMapper;
import tk.mybatis.springboot.model.TbBookingAssess;
import tk.mybatis.springboot.model.TbMaintenanceOrderSaicAssessOld;
import tk.mybatis.springboot.tmplate.AbstractSqlScriptTemplate;

import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class MaintenanceOrderSaicAssessOldService extends AbstractSqlScriptTemplate {
    @Autowired
    private TbMaintenanceOrderSaicAssessOldMapper tbMaintenanceOrderSaicAssessOldMapper;

    @Autowired
    private TbBookingAssessMapper tbBookingAssessMapper;

    {
        tableIndex = 2;
    }

    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    @Override
    public String generatorSqlScript() {
        //获取数据
        List<TbMaintenanceOrderSaicAssessOld> list = tbMaintenanceOrderSaicAssessOldMapper.selectAll();
        //生成文件
        saveSqlScriptFile(list, TbMaintenanceOrderSaicAssessOld.class, sourceTables[tableIndex]);

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
        List<TbBookingAssess> list = readSqlScriptFile(sourceTables[tableIndex], TbBookingAssess.class);
        //插入数据库
        list.parallelStream().forEach(element -> {
            tbBookingAssessMapper.insert(element);
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
            TbMaintenanceOrderSaicAssessOld pgcOld = (TbMaintenanceOrderSaicAssessOld) e;
            TbBookingAssess tbBookingAssess = new TbBookingAssess();
            BeanUtils.copyProperties(pgcOld, tbBookingAssess);
            //手动设置未匹配的字段
            try {
                tbBookingAssess.setIsValid(true);
            } catch (Exception ex) {
                LOGGER.error("Exception:", ex);
                throw new RuntimeException(ex.getMessage());
            }

            LOGGER.info("TbMaintenanceOrderSaicAssessOld: {}", pgcOld);
            LOGGER.info("tbBookingAssess: {}", tbBookingAssess);
            jsonArray.add(tbBookingAssess);
        });
    }
}
