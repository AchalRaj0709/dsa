public class Practice {
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.print(n+" ");
    }
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }
    public static int sum(int n){
        if(n==0) return 0;
        return n+sum(n-1);
    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int firstOccurence(int[] arr,int k,int i){
        if(i==arr.length-1) return -1;
        if(arr[i]==k) return i;
        return firstOccurence(arr, k, i+1);
    }
    public static int lastOccurence(int[] arr,int k,int i){
        if(i==0) return -1;
        if(arr[i]==k) return i;
        return lastOccurence(arr, k, i-1);
    }
    public static int power(int x,int n){
        // if(n==0)return 1;
        // return x*power(x, n-1);
        return (n==0)?1:x*power(x, n-1);
    }
    public static int optimizedPower(int x,int n){
        if(n==0) return 1;
        int halfPower=optimizedPower(x, n/2);
        int halfPowerSq=halfPower*halfPower;
        //n is odd
        if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
        }
        return halfPowerSq;

    }
    public static void main(String[] args){
        // print(10);
        // System.out.println(fact(5));
        // System.out.println(sum(10));
        // System.out.println(fibonacci(5));
        // int[] arr={5,5,5,5};
        // System.out.println(firstOccurence(arr, 5, 0));
        // System.out.println(lastOccurence(arr, 5, arr.length-1));
        // System.out.println(power(2,10));
        System.out.println(optimizedPower(2, 10));

    }
}