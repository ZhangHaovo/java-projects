package com.hao.d7_properties;

import java.io.FileReader;
import java.util.Properties;

/**将属性文件中的键值对信息读取出来*/
public class d2_properties_read {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();

        /**加载属性文件中的键值对数据到属性对象properties中去*/
        properties.load(new FileReader("d20_File-io\\src\\com\\hao\\d2_io\\name.properties"));

        System.out.println(properties);
        String rs = properties.getProperty("zhanghao");
        System.out.println(rs);
    }
}
