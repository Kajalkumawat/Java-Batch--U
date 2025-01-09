interface A{
    void show1();
}
interface B { 
    void show2();
}
//multiple inheritance problem solve because interface can not create constrcutor 
class C implements A,B{
    public void show1(){
        System.out.println("interface A");
    }
    public void show2(){
        System.out.println("interface B");
    }
    //class c method 
    void display(){
        System.out.println("c class method ");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        C p=new C();
        p.show1();
        p.show2();
        p.display();
    }
}
