package tk.mybatis.springboot.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.springboot.model.TbPickGiveCarOrderOld;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

@Repository
public interface TbPickGiveCarOrderOldMapper extends MyMapper<TbPickGiveCarOrderOld> {

    List<TbPickGiveCarOrderOld> selectAll();
}