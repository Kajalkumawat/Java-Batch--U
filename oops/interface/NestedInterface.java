interface A{
    interface B{
       void show();
    }
}
class C implements A.B{
    public void show(){
        System.out.println("hello");
    }
}
public class NestedInterface {
    public static void main(String[] args) {
        C p=new C();
        p.show();

        A.B k=new C();
        k.show();
    }
}
