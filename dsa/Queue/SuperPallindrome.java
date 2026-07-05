public class SuperPallindrome {
    public static boolean isPallindrome(int n){
        int rev=0;
        int num=n;
        while(n!=0){
            rev=rev*10+(n%10);
            n/=10;
        }
        return rev==num;
    }
    public static int isSuperPallindrome(String left,String right){
        int l=Integer.parseInt(left);
        int r=Integer.parseInt(right);
        int count=0;
        for(int i=l;i<=r;i++){
            int root=(int)Math.sqrt(i);
            if(root* root ==i){
                if(isPallindrome(i) && isPallindrome(root)){
                    count++;
                }

            }
            
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(isSuperPallindrome("4", "1000"));
    }
}