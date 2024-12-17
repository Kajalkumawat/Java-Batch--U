//create class :used class keyword 
class A {
    void show() {
        System.out.println("hello world");
    }
}

public class MethodBasic1 {
    public static void main(String[] args) {
        // want to call show method
        // class does not consume any space in memory (inside the class always consume
        // memory through object )
        A p = new A();
        p.show();
    }
}
