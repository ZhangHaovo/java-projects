package com.hao.d2_dom4j_demo;

import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.junit.Test;


/**案例，解析XML文件中的数据成为一个List集合对象*/
public class d1_test {
    @Test
    public void parseToList() throws Exception{
        /**创建SAXReader*/
        SAXReader saxReader = new SAXReader();

        /**加载XML文件成为文档Document对象*/
        Document document = saxReader.read(d1_test.class.getResourceAsStream("/Contacts.xml"));
    }
}
