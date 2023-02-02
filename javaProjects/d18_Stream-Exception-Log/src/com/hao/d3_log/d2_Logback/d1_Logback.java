package com.hao.d3_log.d2_Logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**Logback日志框架
         *  几个技术模块：slf4j-api(日志规范)、logback-core(基础模块)、logback-classic（log4j的改良版本）、logback-access
         *
         *  实现步骤：1.在模块目录下创建一个lib目录，导入以上3个jar包
         *          2.添加到依赖库:右键add as Library
         *          3.将Logback的核心配置文件logback.xml直接拷贝到src目录下
         *          4.在代码中获取日志对象
 *
 *          日志级别：级别程度依次是：trace<debug<info<warn<error;默认级别是debug，ALL和OFF分别是打开全部日志信息，及关闭全部日志信息，具体在<root level = "INFO">标签的level属性中设置日志级别
 *              作用：用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息
         */

public class d1_Logback {

    //创建Logback的日志对象，代表了日志技术
    public static final Logger LOGGER = LoggerFactory.getLogger("d1_Logback.class");

    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行了");
            LOGGER.info("开始记录第二行日志，开始做除法");
            int a = 10;
            int b = 0;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);

            System.out.println(a/b);
        } catch (Exception e) {
            LOGGER.error("功能出现异常" + e);
        }

    }
}
