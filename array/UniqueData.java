public class UniqueData {
    public static void unique(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                  //  a[i]=-1;
                    a[j]=-1;
                }
            }
        }

        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                System.out.print(a[i]+" ");
            }
        }
    }
        public static void main(String[] args){
        int a[]={1,2,3,4,3,2,1};
        unique(a);
    }
}
