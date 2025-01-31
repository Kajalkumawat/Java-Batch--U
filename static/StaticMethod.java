class A{
    void show(){
        System.out.println("normal method");
    }
    //static method and class method 
    //no need object creation 
    static void m(){
        System.out.println("static method");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
        A p=new A();
        p.show();
        A.m();
    }
}