class A {
    int a;

    A(int a) {
        this.a = a;
        System.out.println(a);
    }
}

public class InstanceVariableInput5 {
    public static void main(String[] args) {
        new A(56);
    }
}
