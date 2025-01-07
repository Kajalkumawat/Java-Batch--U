abstract class A{
    //abstract void display();
    //non-abstract method :always define in abstract class 
    void show(){
        System.out.println("non-abstract method");
    }
}
class B extends A{

}
public class AbstractBasic6 {
    public static void main(String[] args) {
      A p=new B(); 
      p.show(); 

      //child k through 
      B k=new B();
      k.show();
    }
}
