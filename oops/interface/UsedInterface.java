interface A{
    void show();
}
class B{
    void show1(){
        System.out.println("show 1m method ");
    }
}
class C extends B implements A{
    public void show(){
        System.out.println("hello");
    }
}
public class UsedInterface {
    public static void main(String[] args) {
        C p=new C();
        p.show1();
        p.show();
    }
}
