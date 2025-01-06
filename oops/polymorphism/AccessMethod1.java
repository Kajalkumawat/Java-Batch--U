class A{
    public void show1(){
        System.out.println("A class method");
    }
}
class B extends A{
    public void show2(){
        System.out.println("B class method");
    }
}
public class AccessMethod1{
    public static void main(String[] args) {
       B p=new B();
       p.show1();
       p.show2(); 
    }
}