package tk.mybatis.springboot.tmplate;

import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import tk.mybatis.springboot.service.SqlScriptService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSqlScriptTemplate {

    protected final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    protected int tableIndex = 0;

    @Value("${sqlScript.sourceDir}")
    private String sourceDir;
    @Value("${sqlScript.suffix}")
    private String suffix;

    @Value("${sqlScript.sourceTables}")
    protected String[] sourceTables;
    @Value("${sqlScript.targetTables}")
    protected String[] targetTables;

//    static {
//        sourceTables = new String[]{"tb_pick_give_car_order_old", "tb_pick_give_car_order_img_old",
//                "tb_maintenance_order_saic_assess_old", "tb_maintenance_order_saic_assess_tob_old", "tb_maintenance_order_saic_assess_info_old"};
//
//        targetTables = new String[]{"tb_pick_give_car_order", "tb_pick_give_car_order_img",
//                "tb_booking_assess", "tb_booking_assess_item", "tb_booking_audio_info"};
//    }


    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    public abstract String generatorSqlScript() ;

    /**
     * 解析sql Json文件
     *
     * @return
     */
    public abstract String analysisSqlScript() ;


    /**
     * 生成Json文件
     *
     * @param list
     * @param tClass
     * @param tableName
     * @param <T>
     */
    public  <T> void saveSqlScriptFile(List<T> list, Class<T> tClass, String tableName) {
        JSONArray jsonArray = new JSONArray();
        try {
            //清洗数据
            cleanData(jsonArray, list, tClass);

            File file = new File(sourceDir + tableName + suffix);
            //判断文件是否存在，若不存在则新建
            if (!file.exists()) {
                file.createNewFile();
            }
            //实例化FileOutputStream
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            //将字符流转换为字节流
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
            //创建字符缓冲输出流对象
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
            //将格式化的jsonarray字符串写入文件
            bufferedWriter.write(jsonArray.toJSONString());
            //清空缓冲区，强制输出数据
            bufferedWriter.flush();
            //关闭输出流
            bufferedWriter.close();
        } catch (IOException ex) {
            LOGGER.error("Exception:", ex);
        }


    }



    /**
     * 读取json文件内容
     *
     * @param tableName
     * @param clazz
     * @param <T>
     * @return
     */
    public <T> List<T> readSqlScriptFile(String tableName, Class<T> clazz) {
        String jsonStr = "";
        List<T> list = new ArrayList<>();
        try {

            File jsonFile = new File(sourceDir + tableName + suffix);
            FileReader fileReader = new FileReader(jsonFile);
            Reader reader = new InputStreamReader(new FileInputStream(jsonFile), "utf-8");
            int ch = 0;
            StringBuffer sb = new StringBuffer();
            while ((ch = reader.read()) != -1) {
                sb.append((char) ch);
            }
            fileReader.close();
            reader.close();
            jsonStr = sb.toString();
            list = JSONArray.parseArray(jsonStr, clazz);
        } catch (IOException ex) {
            LOGGER.error("Exception:", ex);
        }
        return list;
    }



    /**
     * 新旧表数据字段转换
     *
     * @param jsonArray
     */
    public abstract <T> void cleanData(JSONArray jsonArray, List<T> list, Class<T> tClass);
}
