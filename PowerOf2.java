public class PowerOf2 {//using recursion

    boolean power(int n){
        return n>0 && ((n & (n-1))==0);

    }
    public static void main(String[] args) {
        PowerOf2 p=new PowerOf2();
        System.out.println(p.power(16));
    }
}