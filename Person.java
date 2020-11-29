package Oriented;

public class Person {
    //这个文件是在计算机内 画的一张图纸
    //描述计算机里的人类长什么样子

/*
    //属性--静态描述特点
    //  属性必要的组成部分
    //  修饰符[权限修饰符(必须写)  特征修饰符]  数据类型  属性名字[= 值]
    public String name;//全局变量  生命周期更长
    public int age;
    public String sex;//boolean int char


    //方法--描述可以做什么事情(动作)
    //无参数无返回值
    //设计一个方法 用来描述人类可以做吃饭这件事情
    public void eat(){
    System.out.println("你吃了一碗大米饭");
    }

    //无参数有返回值
    //设计一个方法 用来告诉别人我的名字“陈宇鹏”
    //若方法的设计规定了返回值类型 方法内必须通过return关键字返回一个值
    public String tellName(){
        System.out.println("你们问我叫什么？让我来告诉你 我的名字吧");
        return "陈宇鹏";
    }

    //有参数无返回值
    //设计一个方法 描述人类可以做吃饭这件事情
    public void chiFanFan(String something,int count){
        System.out.println("吃了"+something);
    }

    //设计一个方法  买饮料  1、需不需要提供条件  2、需不需要留下什么结果
    public String buyDrink(int money){
            if(money>5){
                return "红牛";
            }else{
                return "矿泉水";
            }

 */

    /*
    封装性
    private String name;
    private int age;
    public void tell() {
        System.out.println("姓名："+this.getName()+",年龄："+this.getAge());
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int a) {
        if(a>=0 && a<=100) {
            age = a;
        }
    }
}

class Abc {
    public static void main(String[] args) {
        Person per = new Person();
        per.setName("陈宇鹏");
        per.setAge(18);
        per.tell();
    }

     */

    private String name;
    private int age;
    public Person(String name,int age) {
        this.setName(name);
        this.setAge(age);
    }
    public void tell(){
        System.out.println("姓名：" + getName() + ",年龄：" + getAge());
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        if(a >=0 && a<=100) {
            age = a;
        }
    }
}
class enc {
    public static void main(String[] args){
        Person per = new Person("陈宇鹏",18);
        per.tell();
    }
}


