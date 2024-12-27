class A{
    void show(){
        System.out.println("hello");
    }
    int show(int a){
        System.out.println(a);
        return 0;
    }
}
public class MethodOverloadingBasic4 {
    public static void main(String[] args) {
        A p=new A();
        p.show(45);
    }
}
