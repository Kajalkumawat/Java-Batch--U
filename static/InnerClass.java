//inner class 
class A{
    class B{
        void show(){
            System.out.println("inner class method");
        }
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A p=new A();
        A.B k=p.new B();
        k.show();
    }
}
