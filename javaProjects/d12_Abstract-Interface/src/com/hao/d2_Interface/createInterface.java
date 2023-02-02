package com.hao.d2_Interface;
/*
�ӿڣ�����һ�ֹ淶
    1.�ص㣺���ڽӿ����ֹ淶��˼�룬����Ĭ���ǹ����ģ��ڴ�����棬public static final ����ʡ�Բ�д
    2.�÷����ӿ�����������ʵ�֣�implements���ģ�ʵ�ֽӿڵ����Ϊʵ���࣬ʵ����Ҳ�������Ϊ��ν������
 */
public interface createInterface {
    //jdk 8֮ǰ�ӿ�ֻ���г��󷽷��ͳ���
    String name = "zhang";      //��Ч��public static final String name = "zhang";
    void run();                 //��Ч��public static void run();

    //jdk 8֮������ӿ���ֱ�Ӷ�����з�����ķ���
    //1.Ĭ�Ϸ���������Ҫ��default���Σ���Ĭ��public
    default void method1(){
        System.out.println("�ӿ��е�Ĭ�Ϸ�����");
    }
    //2.��̬����������Ҫ��static���Σ���Ĭ��public(ע�⣺�ӿڵľ�̬��������Ҫ�ñ���Ľӿ���������)
    static void method2(){
        System.out.println("�ӿ��еľ�̬������");
    }
    //3.˽�з���������ʹ��private���Σ�ע�⣺ֻ���ڱ��ӿ��б�������Ĭ�Ϸ�����˽�з������ʣ�
    private void method3(){
        System.out.println("�ӿ��е�˽�з�����");
    }
}

interface law{
    void rule();
}
interface sport extends law{            //�ӿ�֮��Ҳ�����໥�̳�
    void run();
    void competition();

}

class football implements sport{        //�����ʵ�ֶ���ӿ�
    @Override
    public void run() {
        System.out.println("�����˶���Ҫ��");
    }

    @Override
    public void competition() {
        System.out.println("�����˶�Ա��Ҫ����");
    }

    @Override
    public void rule() {
        System.out.println("�����˶�Ա��������ط�");
    }
}

class Test{
    public static void main(String[] args) {
        football user = new football();
        user.run();
        user.competition();

        createInterface.method2();      //�ӿڵľ�̬��������Ҫ�ñ���Ľӿ���������
    }
}