public class Recursion1 {

    void print(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String[] args) {
        Recursion1 r=new Recursion1();
        r.print(5);
    }
}