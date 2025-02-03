//jvm :it give first priority of static block 
class A{
    A(){
        System.out.println("constructor block");
    }
    //anonymous block 
    {
        System.out.println("anoymous block");
    }
    static{
        System.out.println("static block");
    }
}
public class StaticBlock1 {
    public static void main(String[] args) {
       new A(); 
    }
}
