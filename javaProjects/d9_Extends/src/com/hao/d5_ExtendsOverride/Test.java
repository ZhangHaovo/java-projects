package com.hao.d5_ExtendsOverride;
/*方法重载：在继承体系中，子类出现了和父类中一摸一样的方法声明，就称子类这个方法是重写的方法
      应用场景：当子类需要父类的功能，但父类的功能不完全满足自己的需求，子类可以重写父类的方法
      注意事项：1.重写的方法名称、形参列表、必须和被重写的方法名称和形参列表一致
              2.子类重写父类方法时，访问权限必须大于或者等于父类（缺省 < protected < public）
              3.子类不能重写父类的静态方法
*/
public class Test {
    public static void main(String[] args) {
        NewPhone p = new NewPhone();
        p.call();
    }
}

class Phone{
    public void call(){
        System.out.println("打电话");
    }
}

class NewPhone extends Phone{
    //重写方法
    @Override                                    //重写校验注解，加上之后，这个方法必须是正确重写的，这样更加安全。更加程序的可读性
    public void call() {
        super.call();                           //先使用父类中的基本方法
        System.out.println("使用视频通话");       //再添加新的功能
    }
}