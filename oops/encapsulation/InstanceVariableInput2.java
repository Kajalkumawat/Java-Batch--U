//user input of instance variable through method and parameter name is also different : 
class A{
    int a;
    void show(int p){
        a=p;
    }
}
public class InstanceVariableInput2 {
    public static void main(String[] args) {
        A k=new A();
        k.show(67);
    }
}
