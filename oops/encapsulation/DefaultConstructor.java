class A {
    // ->it used for value initialization
    int a;

    // ->class name and constructor name
    A() {
        System.out.println(a);
        System.out.println("hello");
    }

    void show() {
        System.out.println("hello");
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {
        new A();
        A p = new A();
        p.show();
    }
}
