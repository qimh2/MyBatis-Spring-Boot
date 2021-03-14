package tk.mybatis.springboot;

import com.alibaba.fastjson.JSON;
import org.assertj.core.util.Lists;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tk.mybatis.springboot.model.City;

public class MainTest {
    public static void main(String[] args) throws Exception {

        int num = 0;
        num -= 12;
        System.out.println("num="+ num);

        List<City> citys = Lists.newArrayList();
        List<City> citys2 = Lists.newArrayList();

        City city = new City();
        city.setName("aa");
        city.setState("action");
        citys.add(city);

        City city2 = new City();
        city2.setName("bb");
        city2.setState("action2");
        citys.add(city2);
        for (City c : citys) {
            c.setName("dd");
            System.out.println(JSON.toJSONString(c));
            citys2.add(c);
        }
        System.out.println("city2:" + JSON.toJSONString(citys2));

//        for (int i = 0; i < 4; i++) {
//            if (i % 2 == 0) {
//                System.out.println(true);
//            }else {
//                System.out.println(false);
//            }
//        }


//        List<String> list = new ArrayList<>();
//        if (CollectionUtils.isEmpty(list)){
//            throw new Exception("数组为空");
//        }

    }
}
