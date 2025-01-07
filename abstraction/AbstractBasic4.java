abstract class A{
    abstract void show();
}
class B extends  A{
    void show(){
        System.out.println("abstract method ");
    }
}
public class AbstractBasic4 {
    public static void main(String[] args) {
        A p=new A();
        
    }
}
