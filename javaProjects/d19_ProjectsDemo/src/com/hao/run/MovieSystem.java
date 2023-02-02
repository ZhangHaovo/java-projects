package com.hao.run;

import com.hao.bean.Business;
import com.hao.bean.Custom;
import com.hao.bean.Movie;
import com.hao.bean.User;

import java.util.*;

/**
 * ①集成日志框架、用于后期记录日志信息。
 * ②定义一个电影类Movie类，Movie类包含:片名、主演、评分、时长、票价、余票
 * ③系统包含2个用户角色:客户、商家。存在大量相同属性信息。
 * ④定义User类作为父类，属性:登录名称、密码、真实名称、性别、电话、账户金额
 * ⑤定义Business类代表商家角色，属性:店铺名称、地址。
 * ⑥定义Customer类代表客户角色，属性:
 * ⑦定义集合List<User> 用户存放系统注册的用户对象信息。
 * ⑧定义集合Map<Business, List<Movie>>存放商家和其排片信息。
 */
public class MovieSystem {
    /*存储所有的用户*/
    public static final List<User> ALL_USERS = new ArrayList<>();

    /*存储所有商家何其排片信息*/
    public static Map<Business,List<Movie>> ALL_MOVIES = new HashMap<>();

    public static final Scanner SYS_SC = new Scanner(System.in);

    /*准备一些测试数据*/
    static {
        Custom c = new Custom();
        c.setLoginName("zyf888");
        c.setPassword("123456");
        c.setUserName("刘德华");
        c.setSex('男');
        c.setMoney(10000);
        c.setPhone("110110");
        ALL_USERS.add(c);

        Custom c1 = new Custom();
        c1.setLoginName("gzl888");
        c1.setPassword("123456");
        c1.setUserName("关之琳");
        c1.setSex('女');
        c1.setMoney(2000);
        c1.setPhone("111111");
        ALL_USERS.add(c1);

        Business b = new Business();
        b.setLoginName("baozugong888");
        b.setPassword("123456");
        b.setUserName("包租公");
        b.setSex('男');
        b.setMoney(0);
        b.setPhone("110000");
        b.setShopName("甜甜圈国际影城");
        b.setAddress("万达广场4F");
        ALL_USERS.add(b);
        List<Movie> movies = new ArrayList<>();
        ALL_MOVIES.put(b,movies);

        Business b2 = new Business();
        b2.setLoginName("baozupo888");
        b2.setPassword("123456");
        b2.setUserName("包租婆");
        b2.setSex('女');
        b2.setMoney(0);
        b2.setPhone("000000");
        b2.setShopName("巧克力国际影城");
        b2.setAddress("万达广场8F");
        ALL_USERS.add(b2);
        List<Movie> movies2 = new ArrayList<>();
        ALL_MOVIES.put(b2,movies2);
    }

    //定义一个静态的User类型的变量记录登录成功的对象，就不用将对象传入方法中
    public static User loginUser;

    public static void main(String[] args) {
        showMian();
    }

    /*首页展示*/
    private static void showMian() {
        while (true) {
            System.out.println("========欢迎来到Java电影=========");
            System.out.println("1.登陆");
            System.out.println("2.客户注册");
            System.out.println("3.商家注册");
            System.out.println("4.请输入操作命令");
            String command = SYS_SC.nextLine();
            switch (command){
                case "1":
                    login();
                    break;
                case "2":
                    break;
                case "3":
                    break;
                default:
                    System.out.println("命令有误，请确认");
            }
        }
    }

    /*登陆页面*/
    private static void login() {
        System.out.println("请输入你的账号名称");
        String inputName = SYS_SC.nextLine();
        System.out.println("请输入你的密码");
        String inputPassword = SYS_SC.nextLine();

        User user = FindLoginName(inputName);
        if (user != null){
            if (user.getPassword().equals(inputPassword)){
                //账号密码都是正确的，登陆成功，将当前的用户对象传给静态loginUser
                loginUser = user;
                if(user instanceof Custom){
                    //当前是普通用户
                    showCustomerMian();
                }else {
                    //当前是商家用户
                    showBusinessMain();
                }
            }else {
                System.out.println("你的密码有误");
            }
        }else {
            System.out.println("登陆名称有误，请重新输入！！");
        }
    }

    /*商家登陆界面*/
    private static void showBusinessMain() {
        System.out.println("=========商家登陆界面==========");
        System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "欢迎登陆");
        System.out.println("1.展示排片详情：");
        System.out.println("2.上架电影：");
        System.out.println("3.下架电影");
        System.out.println("4.修改电影");
        System.out.println("5.退出");
        System.out.println("请输入你想要进行的操作：");
        String command = SYS_SC.nextLine();
        switch (command){
            case "1":
                showBusinessInfos();
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                login();
                break;
            case "5":
                break;
            default:
                System.out.println("命令有误，请确认");
        }
    }

    //展示拍片的详情
    private static void showBusinessInfos() {
        //根据商家对象作为map的键，提取对应的值就是排片信息
        List<Movie> movies = ALL_MOVIES.get(loginUser);
    }

    /*用户登陆界面*/
    private static void showCustomerMian() {
        System.out.println("=========用户登陆界面==========");
        System.out.println(loginUser.getUserName() + (loginUser.getSex() == '男' ? "先生" : "女士") + "欢迎登陆");
        System.out.println("1.展示影片所有信息：");
        System.out.println("2.根据电影名称查询电影信息：");
        System.out.println("3.评分功能");
        System.out.println("4.购票功能");
        System.out.println("5.退出系统");
        System.out.println("请输入你想要进行的操作");
        String command = SYS_SC.nextLine();
        switch (command){
            case "1":
                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                login();
                break;
            case "5":
                break;
            default:
                System.out.println("命令有误，请确认");
        }
        
    }

    /*根据登录名查询用户对象*/
    public static User FindLoginName(String inputName){
        for (User user : ALL_USERS) {
            if (user.getLoginName().equals(inputName)){
                return user;
            }
        }
        return null;
    }
}
