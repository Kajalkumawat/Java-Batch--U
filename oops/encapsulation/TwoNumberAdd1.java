class A{
   private int a;
   private int b;
   void setA(int a,int b) {
    this.a=a;
    this.b=b;
   }
   int getA(){
    return a;
   }
   int getA1(){
    return b;
   }
   void add(){
    int c=a+b;
    System.out.println("the value of c is "+c);
   }
}
public class TwoNumberAdd1{
    public static void main(String[] args) {
        A p=new A();
        p.setA(34, 78);
        System.out.println(p.getA());
        System.out.println(p.getA1());
        p.add();
    }
}