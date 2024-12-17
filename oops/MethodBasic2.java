class A {
    // first method
    void show1() {
        System.out.println("first method");
    }

    void display() {
        System.out.println("second method");
    }

}

class B {
    void vikram() {
        System.out.println("vikram method");
    }

    void lakshay() {
        System.out.println("lakshay method");
    }

    void shivam() {
        System.out.println("shivam method");
    }
}

public class MethodBasic2 {
    public static void main(String[] args) {
        A a = new A();
        a.show1();
        a.display();

        B p = new B();
        p.shivam();
        p.lakshay();
        p.vikram();
    }
}
