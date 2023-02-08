package com.hao.d3_XPath;
/**XPath:
 * XPath在解析XML文档方面提供了一独树一帜的路径思想，更加优雅，高效
 * XPath使用路径表达式来定位XML文档中的元素节点或属性节点。
 *
 * Xpath的四大检索方案:
 * 1.绝对路径:采用绝对路径获取从根节点开始逐层的查找/contactList/contact/name节点列表并打印信息
 *      /根元素/子元素/孙元素:从根元素开始，一级一级向下查找，不能跨级
 * 2.相对路径:先得到根节点contactList,再采用相对路径获取下一级contact 节点的name子节点并打印信息
 *      ./子元素/孙元素:从当前元素开始，一级一级向下查找，不能跨级
 * 3.全文检索:直接全文搜索所有的name元素并打印
 *      //contact:找contact元素，无论元素在哪里
 *      //contact/name 找contact:无论在哪一级，但name一定是contact的子节点
 *      //contact//name:contact无论在哪一种，name只要是contact的子孙元素都可以找到
 * 4.属性查找:在全文中搜索属性，或者带属性的元素
 *      //@属性名:查找属性对象，无论是哪个元素，只要有这个属性即可。
 *      //元素[@属性名]：查找元素对象，全文搜索指定元素名和属性名。
 *      //元素//[@属性名=‘值’]：查找元素对象，全文搜索指定元素名和属性名，并且属性值相等。
 */

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

/**需求：
 * 使用Dom4J把一个XML文件的数据进行解析
 分析：
 导入jar包(dom4j和jaxen-1.1.2.jar)，Xpath技术依赖Dom4j技术
 通过dom4j的SAXReader获取Document对象
 利用XPath提供的API,结合XPath的语法完成选取XML文档元素节点进行解析操作。
 Document中与Xpath相关的API如下：
 */
public class demo {

    /**显示绝对路径：/根元素/子元素/子元素*/
    @Test
    public void parse01() throws Exception{
        /**创建解析器对象*/
        SAXReader saxReader = new SAXReader();
        /**将xml加载成Document对象*/
        Document document = saxReader.read(demo.class.getResourceAsStream("/Contacts2.xml"));
        /**检索全部的名称 List<Node> selectNodes("表达式")
         * 获取符合表达式的唯一元素 Node selectSingleNode("表达式") */
        List<Node> nameNodes = document.selectNodes("/contactList/contact/name");
        for (Node nameNode : nameNodes) {
            Element nameELe = (Element) nameNode;
            System.out.println(nameELe.getTextTrim());
        }
    }

    /**相对路径:./子元素/孙元素*/
    @Test
    public void parse02() throws Exception{
        /**创建解析器对象*/
        SAXReader saxReader = new SAXReader();
        /**将xml加载成Document对象*/
        Document document = saxReader.read(demo.class.getResourceAsStream("/Contacts2.xml"));
        Element root = document.getRootElement();
        /**利用根元素去定位*/
        List<Node> nameNodes = root.selectNodes("./contact/name");
        for (Node nameNode : nameNodes) {
            Element nameELe = (Element) nameNode;
            System.out.println(nameELe.getTextTrim());
        }
    }

    /**全文检索:直接全文搜索所有的name元素并打印
     *      //contact:找contact元素，无论元素在哪里
     *      //contact/name 找contact:无论在哪一级，但name一定是contact的子节点
     *      //contact//name:contact无论在哪一种，name只要是contact的子孙元素都可以找到*/
    @Test
    public void parse03() throws Exception{
        /**创建解析器对象*/
        SAXReader saxReader = new SAXReader();
        /**将xml加载成Document对象*/
        Document document = saxReader.read(demo.class.getResourceAsStream("/Contacts2.xml"));
        /**寻找所有contact里的name*/
        List<Node> nameNodes = document.selectNodes("//contact/name");
        for (Node nameNode : nameNodes) {
            Element nameELe = (Element) nameNode;
            System.out.println(nameELe.getTextTrim());
        }
    }

    /**属性查找:在全文中搜索属性，或者带属性的元素
     *      //@属性名:查找属性对象，无论是哪个元素，只要有这个属性即可。
     *      //元素[@属性名]：查找元素对象，全文搜索指定元素名和属性名。
     *      //元素//[@属性名=‘值’]：查找元素对象，全文搜索指定元素名和属性名，并且属性值相等。*/
    @Test
    public void parse04() throws Exception{
        /**创建解析器对象*/
        SAXReader saxReader = new SAXReader();
        /**将xml加载成Document对象*/
        Document document = saxReader.read(demo.class.getResourceAsStream("/Contacts2.xml"));
        /**寻找所有contact里的name*/
        List<Node> nameNodes = document.selectNodes("//@id");
        for (Node nameNode : nameNodes) {
            Attribute attr = (Attribute) nameNode;
            System.out.println(attr.getName() + "==>" + attr.getValue());
        }
    }
}
