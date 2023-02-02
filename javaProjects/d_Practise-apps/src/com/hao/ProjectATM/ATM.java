package com.hao.ProjectATM;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            switch (MainPage()) {
                case 0 -> {                  //输入0退出系统
                    return;
                }
                case 1 ->                    //输入1表示登录账户
                    LoginPage(accounts);
                case 2 ->                 //输入2表示注册用户
                    SignupPage(accounts);
            }
        }
    }

    public static int MainPage(){       //主界面模块，返回choose（输入的操作）
        Scanner sc = new Scanner(System.in);
        System.out.println("--------------------欢迎来到中国银行--------------------");
        System.out.println("                      1.登录账户                       ");
        System.out.println("                      2.注册账户                       ");
        while(true) {
            System.out.println("请选择你的操作（输入0即退出系统）：");
            int choose = sc.nextInt();
            if (choose == 1 || choose == 2) {       //
                return choose;
            }else if(choose == 0){
                return 0;
            }else
                System.out.println("不存在此操作！！");
        }
    }

    public static void LoginPage(ArrayList<Account> accounts) {      //登录界面模块
        Scanner sc = new Scanner(System.in);

        if (accounts.size() == 0) {                       //检查系统是否有用户数据，没有可以跳转注册页面或者退出系统
            System.out.println("当前系统没有用户数据！！！请去注册账户!输入1跳转注册页面；输入0退回主页面");
            int temp = sc.nextInt();
            if(temp == 0){
                MainPage();
            }
            else if(temp == 1){
                SignupPage(accounts);
            }
            else {
                System.out.println("你输入的操作代码有误！！");
            }
        }
        else {                                               //当存在用户数据就进行登录
            System.out.println("请输入你的银行卡号：");
            while (true) {                                   //检查银行卡号
                int inCard = sc.nextInt();
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getCard() == inCard) {         //卡号正确后则开始校验账户名称

                        while (true) {
                            System.out.println("请输入你的账户名称：");       //检查账户名称
                            String inName = sc.next();
                            for (int j = 0; j < accounts.size(); j++) {
                                if (accounts.get(i).getName().equals(inName)) {        //账户名称正确则开始校验密码

                                    while(true){
                                        System.out.println("请输入你的密码：");          //检查密码
                                        int inPassword = sc.nextInt();
                                        for (int k = 0; k < accounts.size(); k++) {
                                            if (accounts.get(i).getPassword() == inPassword) {  //密码正确则开始校验验证码
                                                if(Verification()) {        //Verification返回true时表示验证码通过
                                                    System.out.println("用户登录成功！！！");
                                                    UerPage(accounts,accounts.get(i),i);
                                                    return;
                                                }
                                            }
                                        }
                                        System.out.println("你的密码输入错误!!请重新输入"); //没有输入正确的密码则一直输入
                                    }
                                }
                            }
                            System.out.println("你的账户名称输入错误！！请重新输入");        //没有输入正确账户名称则一直输入
                        }
                    }
                }
                System.out.println("你输入的银行卡号有误或者在系统中不存在！！请重新输入");      //没有输入正确卡号则一直输入
            }
        }
    }


    public static void SignupPage(ArrayList<Account> accounts){                     //用户注册模块
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int newCard =0;
        boolean tag = false;                             //设置标记位，true表示没有相同的,false表示有相同的
        Account a = new Account();
        System.out.println("请输入你的账户名称：");
        a.setName(sc.next());

        while (true) {
            System.out.println("请输入你的账户密码：");
            int password = sc.nextInt();
            System.out.println("请你确认密码：");
            int confirmPassword = sc.nextInt();
            if (password == confirmPassword) {          //若确认密码相同，那么就设置此密码，然后生成唯一卡号
                a.setPassword(password);

                while(true) {                           //生成唯一卡号
                    if(!tag) {
                        tag =true;                      //利用tag位来控制是否存在相同的卡号
                        newCard = r.nextInt(100000, 999999);
                        for (int i = 0; i < accounts.size(); i++) {
                            if (accounts.get(i).getCard() == newCard) {
                                tag = false;
                            }
                        }
                    }
                    else{
                        a.setCard(newCard);
                        a.setBalance(0.0);
                        a.setLimit(2000);
                        break;
                    }
                }

                accounts.add(a);
                System.out.println("新用户注册成功，这是你的个人信息：");
                System.out.println("您的卡号是：" + newCard + "\t" +"您的账户名称是：" + a.getName() + "\t" + "您的账户余额为" + a.getBalance() + "\t" + "账户限额为" + a.getLimit());
                return;
            }
            else {
                System.out.println("俩次密码输入有误！！请重新操作");      //若确认密码不同，重复输入俩次密码操作
            }
        }
    }

    public static boolean Verification(){           //验证码模块
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        String verificationNum;
        String Order = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        while(true){
            verificationNum = "";
            for (int i = 0; i < 5; i++) {
                verificationNum += Order.charAt(r.nextInt(62));
            }
            System.out.println("请输入5位验证码（不区分大小写）：" + verificationNum);
            String inVerification = sc.next();
            if(verificationNum.equalsIgnoreCase(inVerification))
                return true;
            else
                System.out.println("输入的验证码有误!!");
        }
    }

    public static void UerPage(ArrayList<Account> accounts,Account account,int i){                               //用户界面
        while(true) {
            System.out.println("尊敬的" + account.getName().charAt(0) + "先生/女士,欢迎使用中国银行ATM系统，请输入你想要的操作:" + "\n" + "1.查询" + "\n" + "2.存款" + "\n" + "3.取款" + "\n" + "4.转账" + "\n" + "5.修改密码" + "\n" + "6.退出" + "\n" + "7.注销用户");
            Scanner sc = new Scanner(System.in);
            switch (sc.nextInt()) {
                case 1 ->
                    Show(account);
                case 2 ->
                    Deposit(account);
                case 3 ->
                    Withdraw(account);
                case 4 ->
                    Transfer(accounts, account);
                case 5 ->
                    ChangePassword(account);
                case 6 -> {
                    System.out.println("请拔出你的银行卡，欢迎您再次光临中国银行！！");
                    return;
                }
                case 7 -> {
                    Free(accounts, i);
                    return;
                }
            }
        }
    }

    public static void Show(Account account){               //用户信息展示模块
        System.out.println("用户信息如下：");
        System.out.println("账户名称：" + account.getName());
        System.out.println("卡号：" + account.getCard());
        System.out.println("账户余额：" + account.getBalance());
        System.out.println("取现额度：" + account.getLimit());
        System.out.println("查询完毕，为您跳转主菜单");
    }

    public static void Deposit(Account account){            //存款模块
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入存款金额");
            double deposit = sc.nextDouble();
            if (deposit > 0) {
                System.out.println("原有账户余额为：" + account.getBalance() + "\t" + "存款金额为:" + deposit);
                account.setBalance(deposit + account.getBalance());
                System.out.println("现有账户余额为：" + account.getBalance());
                return;
            } else {
                System.out.println("输入的存款金额有误");
            }
        }
    }

    public static void Withdraw(Account account){           //取款模块
        Scanner sc = new Scanner(System.in);
        System.out.println("你的账户余额为：" + account.getBalance()  + "\t" + "你账户的限额为：" + account.getLimit());
        while(true) {
            System.out.println("请输入你的取款金额");
            double withdraw = sc.nextDouble();
            if(withdraw > 0 && withdraw <= account.getLimit()){
                account.setBalance(account.getBalance() - withdraw);
                System.out.println("提款成功，现在的账户余额为" + account.getBalance() + "\n" +"正在为您跳转到主菜单");
                return;
            } else if (withdraw <= 0) {
                System.out.println("请输入正确的取款金额");
            }else {
                System.out.println("超过账户限额");
            }
        }
    }

    public static void Transfer(ArrayList<Account> accounts,Account account){           //转账模块
        Scanner sc = new Scanner(System.in);
        double limitTransfer = 5000;

        if(account.getBalance() == 0){                              //余额为0时提示
            System.out.println("余额不足，为您返回菜单");
            return;
        }
        else if(accounts.size() == 1){                                                  //系统中没有多余账号时提示
            System.out.println("系统中没有多余账户，为您返回菜单");
            return;
        }
        else {                                                      //转账主函数
            while(true) {
                System.out.println("请输入对方卡号：");
                int inCard = sc.nextInt();
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).getCard() == inCard) {              //卡号输入正确,准备姓名校验
                        String star = "";                                   //姓后的星星数
                        for (int j = 0; j < accounts.get(i).getName().length()-1; j++) {
                            star += "*";
                        }
                        while(true) {
                            System.out.println("请输入" + accounts.get(i).getName().charAt(0) + star + "的全称");     //姓名隐式处理
                            String inName = sc.next();
                            if (accounts.get(i).getName().equals(inName)) {         //如果姓名校验成功，准备金额校验

                                while (true) {
                                    System.out.println("请输入你要转账的金额：");
                                    double inTransfer = sc.nextDouble();
                                    if (inTransfer <= 0) {                          //错误的转账数字
                                        System.out.println("输入的金额有误");
                                    } else if (inTransfer > limitTransfer) {
                                        System.out.println("超过每日转账限额");         //超过限额
                                    } else if(inTransfer > account.getBalance()) {
                                        System.out.println("转账金额过多，余额不足！！");    //转账金额超过余额
                                    }
                                    else{                                              //校验金额正确后
                                        account.setBalance(account.getBalance() - inTransfer);
                                        accounts.get(i).setBalance(accounts.get(i).getBalance() + inTransfer);
                                        System.out.println("转账成功！！！");
                                        System.out.println("您的账户余额是" + account.getBalance());
                                        return;
                                    }
                                }
                            } else {                                                //姓名校验失败重新输入姓名
                                System.out.println("你输入的名称有错误,请重新输入");
                            }
                        }
                    }
                }
                System.out.println("系统没有你所输入卡号的账户或者你输入的卡号有误");      //卡号输入错误选择重新输入卡号或者返回主菜单
                while(true) {
                    System.out.println("1.重新输入卡号；2.返回主菜单");
                    int temp = sc.nextInt();
                    if (temp == 1) {
                        break;
                    } else if (temp == 2) {
                        return;
                    } else {
                        System.out.println("你输入的操作有误");
                    }
                }
            }
        }
    }

    public static void ChangePassword(Account account){                             //修改密码模块
        Scanner sc  =new Scanner(System.in);

        while (true){
            System.out.println("请输入你现有的密码");
            if(account.getPassword() == sc.nextInt()){                              //现有密码正确后，开始修改密码
                while (true) {
                    System.out.println("输入你想要设置的新密码：");
                    int newPassword = sc.nextInt();
                    System.out.println("确认密码：");
                    int confirmPassword = sc.nextInt();
                    if (newPassword == confirmPassword) {                           //俩次确认密码相同时，提示完成
                        account.setPassword(newPassword);
                        System.out.println("密码设置成功！！");
                        return;
                    } else {
                        System.out.println("俩次密码不一致，请重新操作");
                    }
                }
            }
            else{
                System.out.println("你输入的密码有误！！");
            }
        }
    }

    public static void Free(ArrayList<Account> accounts,int i){
        accounts.remove(i);
        System.out.println("此账户已被注销，为您返回主菜单");
        return;
    }
}
