package Oriented.Property;

class Check {    //ִ�е�¼ʱ�������֤����
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
            str = "��ӭ�� " + name + " ��¼�ɹ���";
        } else {
            str = "�û������������";
        }
        return str;
    }

    public void isExit() {    //��¼��֤�ĵ�һ������-->������������ʽ�Ƿ���ȷ
        if (this.info.length !=2) {
            System.out.println("����Ĳ�����ʽ����ȷ��ϵͳ�˳�");
            System.out.println("��ʽ�������ַ ����");
            System.exit(1);   //ϵͳ�˳�
        }
    }
}


public class LoginDemo {
    public static void main(String args[]) {

        Operate oper = new Operate(args);    //ʵ������������
        System.out.println(oper.Login());
    }
}
