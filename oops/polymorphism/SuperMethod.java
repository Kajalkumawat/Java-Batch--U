class A{
    A(){
        System.out.println("A class constructor call");
    }
    
}
class B extends  A{
    B(){
        //super(); internallly 
        System.out.println("B class constructor call");
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        new B();
    }
}
