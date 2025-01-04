class A{
    void show(int a){
        System.out.println(a);
    }
}
class B extends  A{
    void show(){
        super.show(78);
        System.out.println("hello");
    }
}
public class MethodOverideBasic3 {
    public static void main(String[] args) {
       B p=new B();
       p.show(); 
    }
}
