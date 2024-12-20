class A {
    A() {
        System.out.println("constructor call");
    }

    void show() {
        System.out.println("method call");
    }

    void show1() {
        System.out.println("show1");
    }
}

public class ConstructorBasic {
    public static void main(String[] args) {
        new A().show();
        A p = new A();
        p.show();
        p.show1();
    }
}
