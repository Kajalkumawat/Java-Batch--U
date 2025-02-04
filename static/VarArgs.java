class A{
    void show(int ...a){
        for(int b:a){
           System.out.print(b+" "); 
        }
    }
}
public class VarArgs {
    public static void main(String[] args) {
        A k=new A();
        k.show(1,2,3,4);
    }
}