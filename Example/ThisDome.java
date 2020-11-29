package Oriented.Example;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {  //通过构造方法为属性赋值
        this.setName(name);  //设置姓名
        this.setAge(age);  //设置年龄
    }

    public boolean Person(Person per) {  //通过构造方法访问对象中的属性
        //调用此方法时里面存在两个对象：当前对象、传入的对象
        Person p1 = this;  //表示当前调用方法的对象，为per1
        Person p2 = per;  //表示传递到方法重的对象，为per2
        if (p1 == p2) {  //首先比较的是---->栈内存的两个对象中存储的两个地址是否相等
            return true;
        }
        //分别判断每一个属性是否相等
        if (p1.name.equals(p2.name) && p1.age == p2.age) {
            return true;
        } else {
            return false;
        }
    }
    public void setName(String n) {
        name = n;
    }
    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean compare(Person per2) {
        return true;
    }
}

public class ThisDome {
    public static void main(String[] args) {
        Person per1 = new Person("张维",18);  //声明两个对象，内容完全相等
        Person per2 = new Person("张维",18);  //声明两个对象，内容完全相等
        if(per1.compare(per2)) {
            System.out.println("两个对象相等");
        }else {
            System.out.println("两个对象不相等");
        }
    }
}
