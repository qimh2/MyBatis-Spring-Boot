package tk.mybatis.springboot.controller;

import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.springboot.model.TbUserBrand;
import tk.mybatis.springboot.model.TbUserBrandRang;
import tk.mybatis.springboot.service.UserBrandService;

import java.util.List;

@RestController
@RequestMapping("/userBrand")
public class UserBrandController {

    @Autowired
    private UserBrandService userBrandService;

    @RequestMapping("/queryUserBrand")
    public List<TbUserBrand> queryUserBrand(@RequestBody TbUserBrand tbUserBrand){
        for (int i = 0; i < 100; i++) {
            userBrandService.queryUserBrand(tbUserBrand);
        }
        return Lists.emptyList();
    }

    @RequestMapping("/queryUserBrandRang")
    public List<TbUserBrandRang> queryUserBrand(@RequestBody TbUserBrandRang tbUserBrandRang){
        for (int i = 0; i < 100; i++) {
            userBrandService.queryUserBrandRang(tbUserBrandRang);
        }
        return Lists.emptyList();
    }
}
