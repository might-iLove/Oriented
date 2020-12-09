package Oriented.Property;

class Check {    //执行登录时具体的验证操作
    public boolean validate(String name,String password){
        if (name.equals("1527212808@qq.com") && password.equals("cyp96394901")){
            return true;
        } else {
            return false;
        }
    }
}

class Operate {
    private String info[];

    public Operate(String info[]){
        this.info = info;
    }

    public String Login() {
        Check check = new Check();
        this.isExit();

        String name = this.info[0];
        String password = this.info[1];
        String str = null;

        if (check.validate(name,password)){
            str = "欢迎你 " + name + " 登录成功！";
        } else {
            str = "用户名和密码错误！";
        }
        return str;
    }

    public void isExit() {    //登录验证的第一步操作-->检查输入参数格式是否正确
        if (this.info.length !=2) {
            System.out.println("输入的参数格式不正确，系统退出");
            System.out.println("格式：邮箱地址 密码");
            System.exit(1);   //系统退出
        }
    }
}


public class LoginDemo {
    public static void main(String args[]) {

        Operate oper = new Operate(args);    //实例化操作对象
        System.out.println(oper.Login());
    }
}
