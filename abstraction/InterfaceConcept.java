interface A{
    void show();
}
interface B extends A{
    void show1();
}
class C implements B{
    
    public void show1(){
        System.out.println("B interface");
    }
    public void show(){
        System.out.println("A interface");
    }
}
public class InterfaceConcept{
    public static void main(String[] args){
        C p=new C();
        p.show1();
        p.show();
    }
}