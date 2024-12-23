class A{
    private int a; 
    //setter method :to give the value of instance variable 
    void setA(int a){
        this.a=a;
    } 
    //getter method :used for get the value 
    int getA(){
        return a;
    } 
}
public class GetterandSetter {
    public static void main(String[] args) {
        A p=new A();
        p.setA(78);
        System.out.println(p.getA());
    }
}
