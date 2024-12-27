public class MethodOverloadingBasic5 {
    public static void main(int a){
        System.out.println(a);
    }
    public static void main(int a,int b){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        MethodOverloadingBasic5 k=new MethodOverloadingBasic5();
        k.main(67);
        k.main(4,5);
    }
}
