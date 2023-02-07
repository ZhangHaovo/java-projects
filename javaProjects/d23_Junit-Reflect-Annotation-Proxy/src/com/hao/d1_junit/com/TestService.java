package com.hao.d1_junit.com;

import org.junit.*;

/**测试类*/


public class TestService {

    /**该方法会在每一个测试方法执行之前执行一次*/
    @Before
    public void before() {
        System.out.println("===before方法执行了一次===");
    }

    /**该方法会在每一个测试方法执行之后执行一次*/
    @After
    public void after() {
        System.out.println("===after方法执行了一次===");
    }

    /**修饰静态方法*/
    @BeforeClass
    public static void beforeClass() {
        System.out.println("===beforeClass方法执行了一次===");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("===afterClass方法执行了一次===");
    }

    /**测试方法:1.该测试方法必须是 公共的 无参数 无返回值 的非静态方法;2.使用@Test注解*/
    @Test
    public void testLoginName(){
        Service service = new Service();
        String rs = service.loginName("admin","123456");

        /**预期结果的正确性测试：断言 参数一：消息 ，参数二：期待值 ，参数三：实际值*/
        Assert.assertEquals("您的登录数据可能错误","登录成功",rs);
    }

    @Test
    public void testSelectName(){
        Service service = new Service();
        service.selectName();
    }


}
