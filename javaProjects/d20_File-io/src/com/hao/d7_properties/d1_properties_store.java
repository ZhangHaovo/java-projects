package com.hao.d7_properties;

import java.io.FileWriter;
import java.util.Properties;

/**properties实际上是一个Map集合，但是一般不会当成Map集合使用
 *      核心作用：properties代表的是一个属性文件，可以把自己对象中的键值对信息存入到一个属性文件中去
 *      属性文件：后缀是.properties结尾的文件，里面的内容是 key = value,后续做系统配置信息用的 */
public class d1_properties_store {
    /**使用Properties把键值对信息存入到属性文件中去*/
    public static void main(String[] args) throws Exception {
        /**创建properties文件对象*/
        Properties properties = new Properties();
        properties.setProperty("admin","123456");       //Map集合中利用put功能函数存储信息，而properties利用setProperties存储信息
        properties.setProperty("zhanghao","654321");
        properties.setProperty("Lisi","135793");

        /**将键值对存储到属性文件中去*/
        properties.store(new FileWriter("d20_File-io\\src\\com\\hao\\d2_io\\name.properties"),"Comments");        //俩个参数，第一个为流通向文件的管道，第二个是备注信息

    }
}
