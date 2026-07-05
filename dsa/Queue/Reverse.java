public class Reverse {

    int reverse(int n,int k){
        if(n==0){
            return k;
        }
        k=k*10+n%10;
        return reverse(n/10,k);
    }
    public static void main(String[] args) {
        Reverse r=new Reverse();
        System.out.println(r.reverse(123, 0));
    }
}