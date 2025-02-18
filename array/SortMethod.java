
import java.util.Arrays;

public class SortMethod {
    public static void printn(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,1,0,1};
        Arrays.sort(a);
        printn(a);
    }
}
