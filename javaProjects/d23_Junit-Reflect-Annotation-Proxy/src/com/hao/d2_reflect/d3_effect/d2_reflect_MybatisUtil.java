package com.hao.d2_reflect.d3_effect;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

/**需求：给你任意一个对象，在不清楚对象字段的情况可以，可以把对象的字段名称和对应值存储到文件中去。
 * 分析：
 * - 定义一个方法，可以接收任意类的对象。
 * - 每次收到一个对象后，需要解析这个对象的全部成员变量名称。
 * - 这个对象可能是任意的，那么怎么样才可以知道这个对象的全部成员变量名称呢？
 * - 使用反射获取对象的Class类对象，然后获取全部成员变量信息。
 * - 遍历成员变量信息，然后提取本成员变量在对象中的具体值
 * - 存入成员变量名称和值到文件中去即可。*/
public class d2_reflect_MybatisUtil {

    public static void sava(Object obj){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("d23_Junit-Reflect-Annotation-Proxy\\src\\com\\hao\\d2_reflect\\d3_effect\\data.txt",true));
            /**利用反射提取这个对象的全部成员变量*/
            Class c = obj.getClass();
            /**c.getName获取权限名：包名+类名 ；c.getSimpleName()：获取当前类名*/
            ps.println("========" + c.getSimpleName() + "========");

            /**提取全部成员变量*/
            Field[] fields = c.getDeclaredFields();

            /**获取成员变量的信息*/
            for (Field field : fields) {
                String name = field.getName();
                field.setAccessible(true);
                /**提取本成员变量再obj对象中的值（取值）*/
                String value = field.get(obj) + "";
                ps.println(name + "=" + value);
            }
            ps.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
