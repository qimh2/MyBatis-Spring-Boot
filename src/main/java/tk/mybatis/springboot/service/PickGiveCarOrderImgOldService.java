package tk.mybatis.springboot.service;

import com.alibaba.fastjson.JSONArray;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.TbPickGiveCarOrderImgMapper;
import tk.mybatis.springboot.mapper.TbPickGiveCarOrderImgOldMapper;
import tk.mybatis.springboot.model.TbPickGiveCarOrderImg;
import tk.mybatis.springboot.model.TbPickGiveCarOrderImgOld;
import tk.mybatis.springboot.tmplate.AbstractSqlScriptTemplate;

import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class PickGiveCarOrderImgOldService extends AbstractSqlScriptTemplate {

    @Autowired
    private TbPickGiveCarOrderImgOldMapper tbPickGiveCarOrderImgOldMapper;

    @Autowired
    private TbPickGiveCarOrderImgMapper tbPickGiveCarOrderImgMapper;
    /**
     * 生成sql Json 脚本
     *
     * @return
     */
    @Override
    public String generatorSqlScript() {
        //获取数据
        List<TbPickGiveCarOrderImgOld> list = tbPickGiveCarOrderImgOldMapper.selectAll();
        //生成文件
        saveSqlScriptFile(list, TbPickGiveCarOrderImgOld.class, sourceTables[1]);
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
        List<TbPickGiveCarOrderImg> list = readSqlScriptFile(sourceTables[1], TbPickGiveCarOrderImg.class);
        //插入数据库
        list.parallelStream().forEach(element -> {
            tbPickGiveCarOrderImgMapper.insert(element);
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
            TbPickGiveCarOrderImgOld pgcOld = (TbPickGiveCarOrderImgOld) e;
            TbPickGiveCarOrderImg tbPickGiveCarOrderImg = new TbPickGiveCarOrderImg();
            BeanUtils.copyProperties(e, tbPickGiveCarOrderImg);
            //手动设置未匹配的字段
            try {

                if ("N".equalsIgnoreCase(pgcOld.getDeleted())){
                    tbPickGiveCarOrderImg.setIsValid(true);
                }else{
                    tbPickGiveCarOrderImg.setIsValid(false);
                }
            } catch (Exception ex) {
                LOGGER.error("Exception:", ex);
                throw new RuntimeException(ex.getMessage());
            }

            LOGGER.info("TbPickGiveCarOrderImgOld: {}", e);
            LOGGER.info("tbPickGiveCarOrderImg: {}", tbPickGiveCarOrderImg);
            jsonArray.add(tbPickGiveCarOrderImg);
        });
    }
}
