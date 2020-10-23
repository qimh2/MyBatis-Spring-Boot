package tk.mybatis.springboot.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.TbBookingAudioInfoMapper;
import tk.mybatis.springboot.mapper.TbMaintenanceOrderSaicAssessInfoOldMapper;
import tk.mybatis.springboot.model.TbBookingAudioInfo;
import tk.mybatis.springboot.model.TbMaintenanceOrderSaicAssessInfoOld;
import tk.mybatis.springboot.tmplate.AbstractSqlScriptTemplate;

import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class MaintenanceOrderSaicAssessInfoOldService extends AbstractSqlScriptTemplate {
    @Autowired
    private TbMaintenanceOrderSaicAssessInfoOldMapper tbMaintenanceOrderSaicAssessInfoOldMapper;

    @Autowired
    private TbBookingAudioInfoMapper tbBookingAudioInfoMapper;

    {
        tableIndex = 4;
    }

    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    @Override
    public String generatorSqlScript() {

        List<TbMaintenanceOrderSaicAssessInfoOld> list = tbMaintenanceOrderSaicAssessInfoOldMapper.selectAll();
        //生成文件
        saveSqlScriptFile(list, TbMaintenanceOrderSaicAssessInfoOld.class, sourceTables[tableIndex]);
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
        List<TbBookingAudioInfo> list = readSqlScriptFile(sourceTables[tableIndex], TbBookingAudioInfo.class);
        //插入数据库
        list.parallelStream().forEach(element -> {
            tbBookingAudioInfoMapper.insert(element);
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
            TbMaintenanceOrderSaicAssessInfoOld pgcOld = (TbMaintenanceOrderSaicAssessInfoOld) e;
            TbBookingAudioInfo tbBookingAudioInfo = new TbBookingAudioInfo();
            BeanUtils.copyProperties(e, tbBookingAudioInfo);
            //手动设置未匹配的字段
            try {

                tbBookingAudioInfo.setLastUpdateDate(pgcOld.getUpdateTime());
                if ("N".equalsIgnoreCase(pgcOld.getDeleted())){
                    tbBookingAudioInfo.setIsValid(true);
                }else{
                    tbBookingAudioInfo.setIsValid(false);
                }
            } catch (Exception ex) {
                LOGGER.error("Exception:", ex);
                throw new RuntimeException(ex.getMessage());
            }

            LOGGER.info("TbMaintenanceOrderSaicAssessInfoOld: {}", e);
            LOGGER.info("tbBookingAudioInfo: {}", tbBookingAudioInfo);
            jsonArray.add(tbBookingAudioInfo);
        });
    }
}
