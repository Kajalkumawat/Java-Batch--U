class A{
    A(){
        //default --- int two parameter 
        this(2,3);
        System.out.println("normal");
    }
    A(int a,int b){
        //two parameter---string 
        this("hello");
        System.out.println(a+" "+b);
    }
    A(float a){
    
        System.out.println(a);
    }
    A(String name){
        //string --- float 
        this(67.7f);
        System.out.println(name);
    }
}
public class ConstructorChaining {
    public static void main(String[] args) {
        new A();
    }
}
