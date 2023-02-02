package com.hao.d6_ThisAndSuper;
//���this();�����ã����๹�����з��ʱ����ֵܹ�����
public class ThisTest {
    public static void main(String[] args) {
        Student s1 = new Student("����","����");
        System.out.println(s1.getName() + "\t" + s1.getSchoolName());

        Student s2 = new Student("����");
        System.out.println(s2.getName() + "\t" + s2.getSchoolName());
    }
}

class Student{
    private String name;
    private String SchoolName;

    public Student() {
    }

    /*
    ��ѧ������дѧУ������ѧУΪĬ��ѧУ��
     */
    public Student(String name){
        this(name,"Ĭ��ѧУ��");             //this()�в������������вι�������
    }

    public Student(String name, String schoolName) {
        this.name = name;
        SchoolName = schoolName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}
