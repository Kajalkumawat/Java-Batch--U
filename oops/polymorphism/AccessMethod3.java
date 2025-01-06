class A{
    private void show1(){
        System.out.println("A classs");
    }
    void another1(){
        this.show1();
        // A p=new A();
        // p.show1();
    }
}
class B extends A{
    private void show2(){
        System.out.println("B class method");
    }
    void another2(){
        show2();
    }
}
public class AccessMethod3 {
    public static void main(String[] args) {
        B p=new B();
        p.another1();
        p.another2();
        
    }
}
