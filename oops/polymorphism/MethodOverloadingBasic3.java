class A{
    void show(int a){
        System.out.println("a "+a);
    }
    void show(int a,int b){
    System.out.println(a+" "+b);
    }
}
public class MethodOverloadingBasic3 {
    public static void main(String[] args) {
        A p=new A();
        p.show(45);
        p.show(1,2);
    }
}
