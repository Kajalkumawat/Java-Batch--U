interface A{
    int a=98;
}
class B implements A{
    void show(){
      //  a=34;reassign value 
        System.out.println(a);
    }
}
public class InterfaceVariable1{
    public static void main(String[] args){
       B p=new B();
       p.show();
    }
}