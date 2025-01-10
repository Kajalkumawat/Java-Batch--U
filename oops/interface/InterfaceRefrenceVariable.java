interface A{
    void show();
    default void show1(){
        System.out.println("default method ");
    }
}
class B implements A{
    public void show(){
        System.out.println("show method ");
    }
}
public class InterfaceRefrenceVariable {
    public static void main(String[] args){
        //refrence variable :
        A p=new B();
        p.show();
        p.show1();
    }
}
