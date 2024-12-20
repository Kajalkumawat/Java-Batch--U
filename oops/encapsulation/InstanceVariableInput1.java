class A {
    int a = 89;

    void show() {
        System.out.println(a);
    }
}

public class InstanceVariableInput1 {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}
