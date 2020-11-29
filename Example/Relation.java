package Oriented.Example;
/*
class Person {  //定义Person类
    private String name;
    private int age;
    private Book book;
    private Person child;
    public Person(String name,int age) {  //通过构造方法设置属性
        this.setName(name);  //this.name = name;  为name属性赋值
        this.setAge(age);  //this.age = age;  为age属性赋值
    }
    public void setName(String n) {  //设置属性
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }
    public void setBook(Book b) {  //一个人一本书
        book = b;
    }
    public void setChild(Person child) {  //一个人有一个孩子
        this.child = child;
    }
    public String getName() {  //访问属性-->取得属性
        return name;
    }
    public int getAge() {
        return age;
    }
    public Book getBook() {
        return book;
    }
    public Person getChild() {
        return child;
    }
}

class Book {  //定义Book类
    private String title;
    private float price;
    private Person person;
    private Person child;
    public Book(String title,float price) {
        this.setTitle(title);
        this.setPrice(price);
    }
    public void setTitle(String t) {
        title = t;
    }
    public void setPrice(float p) {
        price = p;
    }
    public void setPerson(Person person) {  //一本书属于一个人
        this.person = person;
    }
    public void setChild(Person child) {  //一本书属于一个孩子
        this.child = child;
    }
    public String getTitle() {
        return title;
    }
    public float getPrice() {
        return price;
    }

    public Person getPerson() {
        return person;
    }

    public Person getChild() {
        return child;
    }
}

public class Relation{
    public static void main(String[] args) {
        Person per = new Person("书艺",19);  //实例化对象per
        Person cld = new Person("秋宇",5);  //实例化对象cld
        Book bk = new Book("三体",96.0f);  //实例化对象bk
        Book b = new Book("格林童话",48.0f);  //实例化对象b
        per.setBook(bk);  //设置对象间的关系
        bk.setPerson(per);  //设置对象间的关系
        cld.setBook(b);  //设置对象间的关系
        b.setPerson(cld);  //设置对象间的关系
        per.setChild(cld);  //设置对象间的关系
        System.out.println("从人找到书---->姓名：" + per.getName() + "\t" + "年龄：" + per.getAge() + "\t" + "书名：" +
                per.getBook().getTitle() + "\t" + "价格：" + per.getBook().getPrice());
        System.out.println("丛书找到人---->书名：" + per.getBook().getTitle() + "\t" + "价格:" + per.getBook().getPrice() +
                "\t" + "姓名：" + per.getName() + "\t" + "年龄：" + per.getAge());
        System.out.println(per.getName() + "的孩子---->姓名：" + per.getChild().getName() + "\t" + "年龄:" +
                per.getChild().getAge() + "\t" + "书名：" +per.getChild().getBook().getTitle() + "\t" + "价格：" +
                per.getChild().getBook().getPrice());
    }
}


 */