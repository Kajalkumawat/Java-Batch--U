//user input of instance variable through method and parameter name is same 
class A {
    int a;

    void show(int a) {
        this.a = a;
        System.out.println(a);
    }
}

public class InstanceVariableInput4 {
    public static void main(String[] args) {
        A p = new A();
        p.show(45);
    }
}
