package com.hao.d1_stream.d3_stream_Demo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static double part1allMoney;
    public static double allMoney;
    public static void main(String[] args) {
        /*某个公司的开发部门，分为一部和二部，现在需要年中数据结算
            分析：员工信息包含了了（名称、性别、工资、奖金、处罚记录）
                开发一部有4个员工，开发二部有5名员工
                分别筛选出2个部门的最高工资的员工信息，封装成有优秀员工对象Topperformer
                分别统计出2个部门的平均月收入，要求去掉最高和最低工资
                统计出2个开发部门整体的平均工资，去掉最低和最高工资的平均值
         */
        List<Employee> part1 = new ArrayList<>();
        part1.add(new Employee("张三",'男',30000,25000,null));
        part1.add(new Employee("李四",'女',25000,1000,"顶撞上司"));
        part1.add(new Employee("王五",'男',20000,20000,null));
        part1.add(new Employee("刘六",'男',20000,20000,null));

        List<Employee> part2 = new ArrayList<>();
        part2.add(new Employee("李强",'男',15000,9000,null));
        part2.add(new Employee("张云",'女',20000,10000,null));
        part2.add(new Employee("胡月",'男',50000,10000,"迟到"));
        part2.add(new Employee("王翔",'男',3500,1000,"迟到"));
        part2.add(new Employee("刘悦",'女',20000,0,"请假"));

        //找到工资最高的人
//        Employee e = part1.stream().max((e1,e2) -> Double.compare(e1.getBonus()+ e1.getSalary(), e2.getBonus()+ e2.getSalary())).get();    找出了工资最高的对象
        topperformer e = part1.stream().max((e1, e2) -> Double.compare(e1.getBonus()+ e1.getSalary(), e2.getBonus()+ e2.getSalary())).map(o -> new topperformer(o.getName(),o.getSalary())).get();
        System.out.println(e);

        //统计平均工资，去掉最高工资和最低工资
        part1.stream().sorted((e1, e2) -> Double.compare(e1.getBonus()+ e1.getSalary(), e2.getBonus()+ e2.getSalary())).skip(1).limit(part1.size()-2).forEach(o -> {
            part1allMoney += (o.getSalary()+o.getBonus());
        });    //利用排序跳过第一个，再取前length-2个元素求和
        System.out.println("开发一部的平均薪水是：" + part1allMoney / (part1.size() - 2 ));

        //统计俩个部门的平均工资
        Stream<Employee> o1 = part1.stream();
        Stream<Employee> o2 = part2.stream();
        Stream<Employee> o3 = Stream.concat(o1,o2);
        o3.sorted((e1, e2) -> Double.compare(e1.getBonus()+ e1.getSalary(), e2.getBonus()+ e2.getSalary())).skip(1).limit(part1.size()+part2.size()-2).forEach(o -> {
            allMoney += (o.getSalary()+o.getBonus());
        });    //利用排序跳过第一个，再取前length-2个元素求和
        //用BigDecimal解决浮点型运算精度失真的问题
        BigDecimal a = BigDecimal.valueOf(allMoney);
        BigDecimal b = BigDecimal.valueOf(part1.size() +part2.size() - 2);
        System.out.println("全部的平均薪水是：" + a.divide(b,2, RoundingMode.HALF_UP));
    }
}
