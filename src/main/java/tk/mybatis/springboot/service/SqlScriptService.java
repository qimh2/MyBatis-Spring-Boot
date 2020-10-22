package tk.mybatis.springboot.service;

import com.alibaba.fastjson.JSONArray;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.util.StringUtil;
import tk.mybatis.springboot.mapper.*;
import tk.mybatis.springboot.model.TbPickGiveCarOrder;
import tk.mybatis.springboot.model.TbPickGiveCarOrderOld;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Service
public class SqlScriptService {

    private static final Logger LOGGER = LoggerFactory.getLogger(SqlScriptService.class);

    private String sourceDir = "D:\\tb-josn-file\\";
    private String suffix = ".json";


    @Autowired
    private TbBookingAssessItemMapper tbBookingAssessItemMapper;
    @Autowired
    private TbBookingAssessMapper tbBookingAssessMapper;
    @Autowired
    private TbBookingAudioInfoMapper tbBookingAudioInfoMapper;
    @Autowired
    private TbMaintenanceOrderSaicAssessInfoOldMapper tbMaintenanceOrderSaicAssessInfoOldMapper;
    @Autowired
    private TbMaintenanceOrderSaicAssessOldMapper tbMaintenanceOrderSaicAssessOldMapper;
    @Autowired
    private TbMaintenanceOrderSaicAssessTobOldMapper tbMaintenanceOrderSaicAssessTobOldMapper;
    @Autowired
    private TbPickGiveCarOrderImgMapper tbPickGiveCarOrderImgMapper;
    @Autowired
    private TbPickGiveCarOrderImgOldMapper tbPickGiveCarOrderImgOldMapper;
    @Autowired
    private TbPickGiveCarOrderMapper tbPickGiveCarOrderMapper;
    @Autowired
    private TbPickGiveCarOrderOldMapper tbPickGiveCarOrderOldMapper;

    private static final String[] sourceTables;
    private static final String[] targetTables;

    static {
        sourceTables = new String[]{"tb_pick_give_car_order_old", "tb_pick_give_car_order_img_old",
                "tb_maintenance_order_saic_assess_old", "tb_maintenance_order_saic_assess_tob_old", "tb_maintenance_order_saic_assess_info_old"};

        targetTables = new String[]{"tb_pick_give_car_order", "tb_pick_give_car_order_img",
                "tb_booking_assess", "tb_booking_assess_item", "tb_booking_audio_info"};
    }


    /**
     * 生成sql 脚本
     *
     * @return
     */
    public String generatorSqlScript() {
        for (int i = 0; i < sourceTables.length; i++) {
            if (sourceTables[i].equalsIgnoreCase("tb_pick_give_car_order_old")) {
                //获取数据
                List<TbPickGiveCarOrderOld> list = tbPickGiveCarOrderOldMapper.selectAll();
                //生成文件
                saveSqlScriptFile(list, TbPickGiveCarOrderOld.class, sourceTables[i]);
            } else if (sourceTables[i].equalsIgnoreCase("tb_pick_give_car_order_old")) {

            } else if (sourceTables[i].equalsIgnoreCase("tb_maintenance_order_saic_assess_old")) {

            } else if (sourceTables[i].equalsIgnoreCase("tb_maintenance_order_saic_assess_tob_old")) {

            } else if (sourceTables[i].equalsIgnoreCase("tb_maintenance_order_saic_assess_info_old")) {

            }
        }

        return "success";
    }

    /**
     * 解析sqlJson文件
     *
     * @return
     */
    @Transactional(rollbackFor = Throwable.class)
    public String analysisSqlScript() {
        for (int i = 0; i < targetTables.length; i++) {
            if (targetTables[i].equalsIgnoreCase("tb_pick_give_car_order")) {
                //读取json文件内容
                List<TbPickGiveCarOrder> list = readSqlScriptFile(sourceTables[i], TbPickGiveCarOrder.class);
                //插入数据库

                list.parallelStream().forEach(element -> {
                    tbPickGiveCarOrderMapper.insertRecord(element);
                });

            } else if (targetTables[i].equalsIgnoreCase("tb_pick_give_car_order_old")) {

            } else if (targetTables[i].equalsIgnoreCase("tb_maintenance_order_saic_assess_old")) {

            } else if (targetTables[i].equalsIgnoreCase("tb_maintenance_order_saic_assess_tob_old")) {

            } else if (targetTables[i].equalsIgnoreCase("tb_maintenance_order_saic_assess_info_old")) {

            }

        }


        return "success";
    }


    /**
     * 读取json文件内容
     *
     * @param tableName
     * @param clazz
     * @param <T>
     * @return
     */
    private <T> List<T> readSqlScriptFile(String tableName, Class<T> clazz) {
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
     * 生成文件
     *
     * @param list
     * @param tClass
     * @param tableName
     * @param <T>
     */
    private <T> void saveSqlScriptFile(List<T> list, Class<T> tClass, String tableName) {
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
     * 新旧表数据字段转换
     *
     * @param jsonArray
     */
    private <T> void cleanData(JSONArray jsonArray, List<T> list, Class<T> tClass) {

        if (tClass.getSimpleName().equals(TbPickGiveCarOrderOld.class.getSimpleName())) {
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


}
