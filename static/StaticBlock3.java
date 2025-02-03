class A{
    static{
        System.out.println("A block");
    }
}
class B extends A{
    //internal jvm implementation 
    // B(){
    //     super();
    // }
    static{
        System.out.println("B block");
    }
}
public class StaticBlock3 {
    public static void main(String[] args) {
        new B();
    }
}
