package com.hao.d2_dom4j_demo;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


/**案例，解析XML文件中的数据成为一个List集合对象*/
public class d1_test {
    @Test
    public void parseToList() throws Exception{
        /**创建SAXReader*/
        SAXReader saxReader = new SAXReader();

        /**加载XML文件成为文档Document对象*/
        Document document = saxReader.read(d1_test.class.getResourceAsStream("/Contacts.xml"));
        /**先拿根元素*/
        Element root = document.getRootElement();
        /**提取contact子元素*/
        List<Element> contactEles = root.elements("contact");
        /**准备ArrayList集合封装联系人信息*/
        List<Contact> contacts = new ArrayList<>();
        for (Element contactEle : contactEles) {
            Contact contact = new Contact();
            contact.setId(Integer.valueOf(contactEle.attributeValue("id")));
            contact.setVip(Boolean.valueOf(contactEle.attributeValue("vip")));
            contact.setName(contactEle.elementTextTrim("name"));
            contact.setGender(contactEle.elementTextTrim("gender").charAt(0));      //字符串取第一个字符
            contact.setEmail(contactEle.elementText("email"));
            /**把联系人对象数据加入到List集合中*/
            contacts.add(contact);
        }
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
}
