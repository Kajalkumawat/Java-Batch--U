class A {
   static int a = 0;// static variable and class variable :only one time memory 

    A() {
        a++;
        System.out.println(a);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        new A();
        new A();
        new A();
    }
}