class A{
    void show(byte a){
        System.out.println("byte"+a);
    }
    void show(int a){
        System.out.println("int "+a);
    }
    void show(double a){
        System.out.println("float "+a);
    }
}
public class MethodOverloadingBasic2 {
    public static void main(String[] args) {
        A p=new A();
        p.show(56);
        p.show((byte)67);//typecasting int convert byte 
        p.show(45.7);
    }
}
