public class ArrayBasic6 {
    public static void main(String[] args){
        int a[]=new int[5];//size=5 index=4 
        a[2]=78;
        System.out.println(a[2]+" "+a[3]);
        System.out.println(a[5]);//array index out of bound exception 
    }
}
