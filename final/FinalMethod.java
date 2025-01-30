class A{
    final void show(){
        System.out.println("A class ");
    }
}
class B extends A{
    final void show(){
        System.out.println("B class ");
    }
}
public class FinalMethod{
    public static void main(String[] args){
        B p=new B();
        p.show();
        
    }
}