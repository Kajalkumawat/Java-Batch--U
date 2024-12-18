import java.util.*;

class A {
    // add method :no return and argument
    void add(int a, int b) {
        int c = a + b;
        System.out.println("the value of c is " + c);
    }

}

public class MethodBasic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a ");
        int a = sc.nextInt();
        System.out.println("enter the value of b ");
        int b = sc.nextInt();
        A p = new A();
        p.add(a, b);
    }
}
