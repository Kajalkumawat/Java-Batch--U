class A{
    static{
        System.out.println("block 1");
    }
    static{
        System.out.println("block 2");
    }
}
public class StaticBlock2{
    public static void main(String[] args) {
        new A();
    }
}