class A{
    /*
     * return :keyword 
     * it is used to terminate the method 
     * it is used to store specific type of data in memory (block )
     */
    //return and no argument 
    char show(){
        char a='i';
        return a;
    }
}
public class MethodBasic6 {
    public static void main(String[] args) {
        A s=new A();
        //two way : 
        //first way 
        System.out.println(s.show());
        //second way 
        char m=s.show();
        System.out.println(m);
    }
}
