class A {
    void show(int a) {// parameter
        System.out.println("the value of a is :" + a);
    }
}

public class MethodBasic3 {
    public static void main(String[] args) {
        A p = new A();
        p.show(2);// argument
    }
}