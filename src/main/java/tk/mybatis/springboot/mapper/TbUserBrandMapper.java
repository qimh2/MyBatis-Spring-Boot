package tk.mybatis.springboot.mapper;

import tk.mybatis.springboot.model.TbUserBrand;
import tk.mybatis.springboot.util.MyMapper;

import java.util.List;

public interface TbUserBrandMapper extends MyMapper<TbUserBrand> {

    List<TbUserBrand>  getUserBrands(TbUserBrand tbUserBrand);

    List<TbUserBrand>  getUserBrandsWithPart(TbUserBrand tbUserBrand);
}