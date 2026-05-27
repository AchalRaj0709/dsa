public class Functions {
    int countDigits(int n){
        int c=0;
        while(n!=0){
            c++;
            n/=10;
        }
        return c;
    }
    void sumDigits(int n){
        int s=0;
        while(n!=0){
            int d=n%10;
            s=s+d;
            n/=10;
        }
        System.out.println("Sum of digits=" +s);
    }
    void product(int n){
        int p=1;
        while(n!=0){
            int d=n%10;
            p*=d;
            n/=10;
        }
        System.out.println("Product"+p);
    }
    public static void main(String[] args) {
        int n=1234;
        Functions ob=new Functions();
        int cd=ob.countDigits(n);
        if(cd%2==0){
            ob.sumDigits(n);
        }else{
            ob.product(n);
        }

    }
}