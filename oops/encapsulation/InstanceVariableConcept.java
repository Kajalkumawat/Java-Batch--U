class A {
    int a;

    A(int a) {
        this.a = a;
        System.out.println("constructor " + a);
    }

    void show() {
        System.out.println("method " + a);
    }
}

public class InstanceVariableConcept {
    public static void main(String[] args) {
        new A(34).show();
    }
}
