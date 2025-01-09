interface A{
    //method :by default :public abstract 
    void show();
    //compile : public abstract void show();
}
class B implements A{ 
    public void show(){
        System.out.println("interface method ");
    }
}
public class CreationOfInterface{
    public static void main(String[] args){
        B p=new B();
        p.show();
    }
} 