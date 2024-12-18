class A {
    int add() {
        int a = 4, b = 3, c;
        c = a + b;
        return c;
    }
}

public class MethodBasic9 {
    public static void main(String[] args) {
        A p = new A();
        System.out.println(p.add());
    }
}
