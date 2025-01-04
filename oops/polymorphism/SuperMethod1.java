class A{
    A(int a){
        System.out.println("the A class is "+a);
    }
}
class B extends A{
    B(int a){
        super(34);
        System.out.println("B class is "+a);
    }
}
public class SuperMethod1 {
    public static void main(String[] args) {
        new B(67);
    }
}
