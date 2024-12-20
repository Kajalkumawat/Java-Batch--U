class A{
    int a;
    A(int p){
        a=p;
        System.out.println(a);
    }
}
public class InstanceVariableInput3 {
    public static void main(String[] args) {
        new A(45);
    }
}
