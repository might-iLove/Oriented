package Oriented.Example;

public class String1 {
    //将字符串转化为字符数组，并将字符数组进行遍历，最后将全部字符数组转化为字符串和部分数组转化为字符串
    public static void main(String[] args){
        String str = "helloworld";
        char c[] = str.toCharArray();
        for(int i = 0;i<c.length;i++){
            System.out.print(c[i] + "\t");
        }
        System.out.println(" ");
        for(char x : c){
            System.out.print(x);
        }
        System.out.println(" ");
        String str1 = new String(c);
        String str2 = new String(c,0,3);
        System.out.println(str1);
        System.out.println(str2);
    }
}
