class A{
    void show1(){
        System.out.println("A classs");
    }
}
class B extends A{
    void show2(){
        System.out.println("B class");
    }
}
public class RefrenceVariable{
    public static void main(String[] args) {
      //refrence varaible 
      //A class refrence varaible 
    A p=new B();
    p.show1();
    //p.show2();
    }
}