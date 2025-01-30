interface A{
    void show();
}
interface B{
    void show();
}
class C implements A,B{
    public void show(){
        System.out.println("hello");
    }
}
public class InterfaceConcept1 {
    public static void main(String[] args){
       B p=new C();
        p.show();
    }
}
