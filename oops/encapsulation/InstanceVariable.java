class A {
    // instance variable :make inside the class and outside the method
    int a;

    void show() {
        int b = 89;// local variable :inside the method
        System.out.println(a + " " + b);
    }

   
}

public class InstanceVariable {
    public static void main(String[] args) {
        A p = new A();
        p.show();
    }
}