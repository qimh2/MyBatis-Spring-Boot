//package tk.mybatis.springboot.test;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Import;
//import org.springframework.test.context.junit4.SpringRunner;
//import tk.mybatis.springboot.Application;
//import tk.mybatis.springboot.model.TbUserBrand;
//import tk.mybatis.springboot.service.UserBrandService;
//
///**
// * @author liuzh
// * @since 2017/9/2.
// */
//@RunWith(SpringRunner.class)
//@SpringBootTest
//@Import(Application.class)
//public class UserBrandServiceTest {
//
//    @Autowired
//    private UserBrandService userBrandService;
//
//    @Test
//    public void testNoPart() {
//        long userId = 10000000000000L;
//        long totalTime = 0;
//        for (int i = 0; i < 10000; i++) {
//            long startTime = System.currentTimeMillis();
//            TbUserBrand userBrand = new TbUserBrand();
//            userBrand.setUserId(userId);
//            userBrand.setBrandCode((byte) 1);
//            userId ++;
//            userBrandService.getUserBrands(userBrand);
//            long cost = System.currentTimeMillis() - startTime;
//            totalTime += cost;
//            System.out.println("cost:" + cost);
//        }
//        System.out.println("总耗时：" + totalTime);
//
//    }
//
//    @Test
//    public void testWithPart() {
//        long userId = 10000000000000L;
//        long totalTime = 0;
//        for (int i = 0; i < 10000; i++) {
//            long startTime = System.currentTimeMillis();
//            TbUserBrand userBrand = new TbUserBrand();
//            userBrand.setUserId(userId);
//            userBrand.setBrandCode((byte) 1);
//            userId ++;
//            userBrandService.getUserBrandsWithPart(userBrand);
//            long cost = System.currentTimeMillis() - startTime;
//            totalTime += cost;
//            System.out.println("cost:" + cost);
//        }
//        System.out.println("总耗时：" + totalTime);
//
//    }
//}
