package Oriented.Example;

public class Student {
    private String stuno;
    private String name;
    private float math;
    private float english;
    private float computer;
    public Student() {
    }
    public Student(String stuno,String name,float math,float english,float computer) {
        this.setStuno(stuno);
        this.setName(name);
        this.setMath(math);
        this.setEnglish(english);
        this.setComputer(computer);
    }
    public void tell() {
        System.out.println("学生学号：" + getName() +"\t"+  "学生姓名：" + getName() +"\t"+  "数学成绩：" + getMath() +"\t"+
                 "英语成绩：" + getEnglish() +"\t"+  "计算机成绩：" + getComputer() +"\t"+  "最高分：" + max() +"\t"+  "最低分：" +
                min() +"\t"+  "总分：" + sum() +"\t"+  "平均分：" + avr());
    }
    public void setStuno(String s) {
        stuno = s;
    }
    public void setName(String n) {
        name = n;
    }
    public void setMath(float m) {
        math = m;
    }
    public void setEnglish(float e) {
        english = e;
    }
    public void setComputer(float c) {
        computer = c;
    }
    public String getStuno() {
        return stuno;
    }
    public String getName() {
        return name;
    }
    public float getMath() {
        return math;
    }
    public float getEnglish() {
        return english;
    }
    public float getComputer() {
        return computer;
    }
    public float sum() {
        return math + english + computer;
    }
    public float avr() {
        return this.sum()/3;
    }
    public float max() {
        float max = math;
        max = max > computer ? max : computer;
        max = max >english ? max : english;
        return max;
    }
    public float min() {
        float min = math;
        min = min > computer ? min : computer;
        min = min > english ? min : english;
        return min;
    }
}

class test{
    public static void main(String[] args) {
        Student stu = new Student("2020214755", "陈宇鹏", 98.0f, 97.0f, 96.0f);
        stu.tell();
    }
}