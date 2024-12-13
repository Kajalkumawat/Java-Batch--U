public class JumpingStatement {
    public static void main(String[] args) {
        // 12345 (6 not print )
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; 
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // continue :1 2 3 4 6 7 8 9 10
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
