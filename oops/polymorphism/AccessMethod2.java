class A{
    private void show1(){
        System.out.println("A classs");
    }
}
class B extends A{
    private void show2(){
        System.out.println("B class method");
    }
}
public class AccessMethod2 {
    public static void main(String[] args) {
       B p=new B();
       p.show1();
       p.show2(); 
       //not possible 
    }
}