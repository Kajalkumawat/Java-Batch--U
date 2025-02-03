class A{
    static class B{//nested class 
        //method :static method 
        static void show(){
            System.out.println("hello world");
        }
    }
}
public class NestedClass {
    public static void main(String[] args) {
        //first way :inner class 
        // A p=new A();
        // A.B k=p.new B();
        // k.show();
        //second way :nested class
        A.B.show();
    }
}
