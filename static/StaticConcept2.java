public class StaticConcept2 {
    public static void main(String[] args) {
        A k=new A();
        k.show();
    }
}
class A{
    static int a=8;
    static void show(){
         System.out.println(a);
     }
 }