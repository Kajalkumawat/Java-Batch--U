    import java.util.*;

    public class SwitchBasic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the value ");
            int a = sc.nextInt();
            switch (a) {
                case 1: {
                    System.out.println("one");
                    //break;
                }
                case 2: {
                    System.out.println("two");
                //  break;
                }
                default: {
                    System.out.println("not mtached");
                }
                /*
                * case 'a':{
                * sout("apple");
                * break;
                * }
                */
            }
        }
    }
