class A {
    int show(int a) {
        return a;
    }
}

public class MethodBasic10 {

    public static void main(String[] args) {
        // two way call :
        A p = new A();
        // first way :
        System.out.println(p.show(56));
        // second way :
        int m = p.show(23);
        System.out.println(m);
    }
}