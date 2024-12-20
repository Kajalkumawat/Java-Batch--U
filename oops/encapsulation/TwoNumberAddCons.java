import java.util.*;

class A {
    A(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
}

public class TwoNumberAddCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        new A(a, b);
    }
}
