class A{
    A(int a){
        System.out.println("the value of a is "+a);
    }
}
class B extends A{
   
    B(int a){
        super(45);
        System.out.println("the value a is "+a);
       // this(6,7);
    }
    B(){
        this(67);
        System.out.println("default call");
    }
    // B(int a,int b){

    // }
}
public class SuperAndThis {
    public static void main(String[] args) {
        new B();
    }
}
