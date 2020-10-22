package tk.mybatis.springboot.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.springboot.model.TbPickGiveCarOrder;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

@Repository
public interface TbPickGiveCarOrderMapper extends MyMapper<TbPickGiveCarOrder> {

    /**
     * 插入数据
     * @param tbPickGiveCarOrder
     * @return
     */
    Integer insertRecord(TbPickGiveCarOrder tbPickGiveCarOrder);
}