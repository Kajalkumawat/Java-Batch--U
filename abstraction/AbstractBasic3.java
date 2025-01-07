abstract class A{
    A(){
        System.out.println("constructor call");
    }
    abstract void show();
}
class B extends A{
    // B(){
    //     super();
    // }
    void show(){
        System.out.println("abstract method");
    }
}
public class AbstractBasic3 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
