public class SquareRoot {

    public static void main(String[] args) {
        int n=16;
        int l=0,r=n;
        for(int i=0;i<n;i++){
            int m=(l+r)/2;
            if(m*m==n){
                System.out.println(m);
                return;
            }else if(m*m>n){
                r=m-1;
            }else{
                l=m+1;
            }
        }
    }
}