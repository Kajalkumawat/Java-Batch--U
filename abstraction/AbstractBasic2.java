//abstract class 
abstract class A{
    abstract void show();
}
class B extends A{
    //define : 
    void show(){
        System.out.println("abstract class ");
    }
    void display(){
        System.out.println("display");
    }
}
public class AbstractBasic2 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
        p.display();
    }
}
