package com.hao.d3_StaticCode;
/*代码块是类的5大成分之一（成员变量、构造器、方法、代码块、内部类），定义在类中方法外
在java类中，使用{}括起来的代码就叫代码块
 */
public class Code {
    public static String name;
    /*静态代码块:使用static修饰，与类一起优先加载，而且自动触发，只执行一次
                使用场景：在类的加载的时候做一些静态数据初始化的操作，以便后续使用
     */
    static {
        System.out.println("-------静态代码块被触发加载了-------");
        name = "张三";
    }




    public Code(){
        System.out.println("-------无参构造器被触发加载了-------");
    }
    /*
    构造代码块（用的少）：每次创建对象，调用构造器实行时，都会执行代码块中的代码，而且在构造器执行前执行
                 使用场景：初始化实例资源
     */
    {
        System.out.println("-------实例代码块被触发加载了-------");
    }



    public static void main(String[] args) {
        System.out.println("-------main被触发加载了-------");
        System.out.println(name);

        Code demo = new Code();
    }
}
