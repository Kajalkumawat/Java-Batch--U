interface A{
    class B{
        void show(){
            System.out.println("class in interface");
        }
    }
}
class C extends  A.B{

}
public class InterfaceClass {
    public static void main(String[] args) {
    //    A.B p=new B();
    //    p.show();  not possible
    C p=new C();
    p.show(); 
    }
}
