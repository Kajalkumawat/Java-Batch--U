class Armstrong {
    // method
    void arm(int n) {
        // logic of armstrong
        int rem, sum = 0;
        int temp = n;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.println("armstrong number ");
        } else {
            System.out.println("not");
        }
    }
}

public class MethodBasic5 {
    public static void main(String[] args) {
        // create object Armstrong class
        Armstrong a = new Armstrong();
        a.arm(153);
    }
}
