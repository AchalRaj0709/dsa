public class Recursion2 {

    int sum(int n){
        if (n==0){
            return 0;
        }

        return (n%10)+sum(n/10);
        
    }
    public static void main(String[] args) {
        Recursion2 rb=new Recursion2();
        System.out.println(rb.sum(123));
    }
}