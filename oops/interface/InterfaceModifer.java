interface A{
    //public method :
    void show(); //by default :public abstract 
    //when using default keyword then create non-abstract method in interface 
    default void display(){
        System.out.println("non-abstract method from interface ");
        show1();
    }
    private void show1(){
        System.out.println("private interface method");
    }

}
class B implements  A{
    public void show(){
        System.out.println("interface abstract method ");
    }
}
public class InterfaceModifer {
 public static void main(String[] args) {
    B p=new B();
    p.show();
    p.display();
 }   
}
