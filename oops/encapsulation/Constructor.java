class A {
    // constructor create
    A() {
        System.out.println("constructor call");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // two way :
        new A();

        // second way:
        A p = new A();
    }
}
