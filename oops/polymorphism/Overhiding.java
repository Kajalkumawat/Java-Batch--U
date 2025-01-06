class A{
    static  void show(){
        System.out.println("A class");
    }
}
class B extends A{
   static void show(){ 
   // super.show();
        System.out.println("B class");
    }
}
public class Overhiding {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}
