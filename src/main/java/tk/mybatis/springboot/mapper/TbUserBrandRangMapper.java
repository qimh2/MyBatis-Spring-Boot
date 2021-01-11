package tk.mybatis.springboot.mapper;

import org.springframework.stereotype.Repository;
import tk.mybatis.springboot.model.TbUserBrandRang;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

@Repository
public interface TbUserBrandRangMapper extends MyMapper<TbUserBrandRang> {

    List<TbUserBrandRang> queryUserBrandRang(TbUserBrandRang tbUserBrandRang);
}