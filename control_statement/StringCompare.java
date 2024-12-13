import java.util.*;
public class StringCompare { 
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
       System.out.println("enter the string ");
       String name=sc.next();

       if(name.equals("apple")){
        System.out.println("A");
       }
       else{
        System.out.println("input is not matched");
       }
    }
}
