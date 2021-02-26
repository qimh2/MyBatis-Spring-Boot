package tk.mybatis.springboot;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tk.mybatis.springboot.model.City;

public class MainTest {
    public static void main(String[] args) throws Exception {
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

        City city = new City();
        city.setName("aa");
        city.setState("action");
        System.out.println(city);
    }
}
