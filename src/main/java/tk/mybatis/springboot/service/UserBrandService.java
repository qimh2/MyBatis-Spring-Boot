package tk.mybatis.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.TbUserBrandMapper;
import tk.mybatis.springboot.model.TbUserBrand;

import java.util.List;
@Service
public class UserBrandService {

    @Autowired
    private TbUserBrandMapper tbUserBrandMapper;

    public List<TbUserBrand> getUserBrands(TbUserBrand tbUserBrand){
       return tbUserBrandMapper.getUserBrands(tbUserBrand);
    }

    public List<TbUserBrand> getUserBrandsWithPart(TbUserBrand tbUserBrand){
        return tbUserBrandMapper.getUserBrandsWithPart(tbUserBrand);
    }
}
