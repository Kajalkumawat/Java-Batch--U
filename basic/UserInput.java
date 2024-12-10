import java.util.*;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        // predefine method :object k through call
        // nextInt() :predefine method
        int a = sc.nextInt();
        System.out.println("the value of a is " + a);
        System.out.println("enter any single character");
        char b = sc.next().charAt(0);
        System.out.println("the value of b is " + b);
    }
}
