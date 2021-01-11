package tk.mybatis.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.springboot.mapper.TbUserBrandMapper;
import tk.mybatis.springboot.model.TbUserBrand;

import java.util.List;
import tk.mybatis.springboot.mapper.TbUserBrandRangMapper;
import tk.mybatis.springboot.model.TbUserBrand;
import tk.mybatis.springboot.model.TbUserBrandRang;

import java.util.List;

@Service
public class UserBrandService {

    @Autowired
    private TbUserBrandMapper tbUserBrandMapper;

    @Autowired
    private TbUserBrandRangMapper tbUserBrandRangMapper;

    public List<TbUserBrand> queryUserBrand(TbUserBrand tbUserBrand){
//        TbUserBrand tbUserBrandQuery = new TbUserBrand();
//        tbUserBrandQuery.setUserId(10000000000001L);
        Long startTime = System.currentTimeMillis();
        List<TbUserBrand> tbUserBrandList = tbUserBrandMapper.queryUserBrand(tbUserBrand);
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + " 毫秒");
        return tbUserBrandList;
    }

    public List<TbUserBrandRang> queryUserBrandRang(TbUserBrandRang tbUserBrandRang){
        Long startTime = System.currentTimeMillis();
        List<TbUserBrandRang> tbUserBrandList = tbUserBrandRangMapper.queryUserBrandRang(tbUserBrandRang);
        Long endTime = System.currentTimeMillis();
        System.out.println("耗时：" + (endTime - startTime) + " 毫秒");
        return tbUserBrandList;
    }
}
