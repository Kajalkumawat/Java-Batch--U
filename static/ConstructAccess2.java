class A{
    private A(){
        System.out.println("private constructor");
    }
    public A(int a){
      //  this();
      new A();
    }
    //method 
    static void show(){
        new A();
    }
}
public class ConstructAccess2 {
    public static void main(String[] args) {
      // A.show();
      new A(56);
    }
}
