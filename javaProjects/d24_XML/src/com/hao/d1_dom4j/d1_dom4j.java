package com.hao.d1_dom4j;
/**
 * XML解析:
 *      SAX解析
 *     *DOM解析
 *
 * Dom常见的解析工具:
 *  JAXP：SUN公司提供的一套XML的解析的API
 *  JDOM：JDOM是一个开源项目，它基于树型结构，利用纯JAVA的技术对XML文档实现解析、生成、序列化以及多种操作。
 * *dom4j：是JDOM的升级品，用来读写XML文件的。具有性能优异、功能强大和极其易使用的特点，它的性能超过sun公司官方的dom 技术，同时它也是一个开放源代码的软件，Hibernate也用它来读写配置文件。
 *  jsoup：功能强大DOM方式的XML解析开发包，尤其对HTML解析更加方便
 *
 *  DOM解析解析文档对象模型:
 *  Document对象：整个xml文档
 *  Element对象：标签
 *  Attribute对象：属性
 *  Text对象：文本内容
 *  */

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * 使用Dom4J解析出XML文件
 下载Dom4j框架，官网下载。
 在项目中创建一个文件夹：lib
 将dom4j-2.1.1.jar文件复制到 lib 文件夹
 在jar文件上点右键，选择 Add as Library -> 点击OK
 在类中导包使用
 */
public class d1_dom4j {
    @Test
    public void parseXMLData() throws Exception{
        /**创建一个Dom4j解析器对象，代表了整个dom4j框架 public SAXReader()*/
        SAXReader saxReader = new SAXReader();

        /**把XML文件加载到内存中成为一个Document文档对象*/
//        Document document = saxReader.read(new File("d24_XML\\src\\Contacts.xml"));
        /**注意：/是直接到src目录下寻找文件的*/
        InputStream is = d1_dom4j.class.getResourceAsStream("/Contacts.xml");
        Document document = saxReader.read(is);

        /**获取根元素对象*/
        Element root = document.getRootElement();
        System.out.println(root.getName());

        /**获取根元素下的所有子元素(一级)*/
        List<Element> elements = root.elements("contact");      //拿指定名字元素
        for (Element element : elements) {
            System.out.println(element.getName());
        }

        /**获取某个子元素,多个的话默认提取第一个*/
        Element contact = root.element("contact");
        System.out.println(contact.getName());

        /**取元素内容,注意要在有文本的情况下才能取文本*/
        System.out.println(contact.elementText("name"));
        /**取元素内容，去掉前后空格*/
        System.out.println(contact.elementTextTrim("name"));

        /**根据元素获取属性值*/
        Attribute idAttr = contact.attribute("id");
        System.out.println(idAttr.getName() + "==>" + idAttr.getValue());

        /**获取当前元素的子元素对象*/
        Element email = contact.element("email");
        System.out.println(email.getText());

        /**直接拿属性值*/
        System.out.println(contact.attributeValue("id"));
        System.out.println(contact.attributeValue("vip"));
    }
}
