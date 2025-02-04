class A{
    public A(){
        System.out.println("public constructor A");
    }
}
class B extends A{
    B(){
        System.out.println("public constructor B");
    }
}
public class ConstructAccess1{
    public static void main(String[] args){
        new A();
    }
}