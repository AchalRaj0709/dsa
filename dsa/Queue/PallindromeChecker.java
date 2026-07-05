public class PallindromeChecker {

    int reverse(int n,int k){
        if(n==0){
            return k;
        }
        k=k*10+n%10;
        return reverse(n/10,k);
    }
    boolean isPallindrome(int n){
        if(n==reverse(n, 0)){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        PallindromeChecker p=new PallindromeChecker();
        int n=1221;
        if(p.isPallindrome(n)){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
