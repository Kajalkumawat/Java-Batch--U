//method override :class name diffrent but method name same 
class A{
  
    void show(){
        System.out.println("A class method");
    }
    
}
class B extends A{
  
    void show(){
        System.out.println("B class method ");
    }
}
public class MethodOverideBasic1{
    public static void main(String[] args) {
       B p=new B();
       p.show(); 
    }
}