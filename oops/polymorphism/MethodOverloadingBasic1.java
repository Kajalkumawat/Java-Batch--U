/*->in a class method name same and number of parameter is also same then method will be overloaded this is known as method overloading .  */
class A{
    void show(){
        System.out.println("hello");
    }
    void show(int a){
        System.out.println(a);
    }
}
public class MethodOverloadingBasic1{
     public static void main(String[] args) {
        A p=new A();
        p.show();
    }
}