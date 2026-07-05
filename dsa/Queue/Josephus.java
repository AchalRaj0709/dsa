public class Josephus {
    int josephus(int n,int k){
        if(n==1){
            return 0;
        }
        return (josephus(n-1, k)+k)%n;
    }
    public static void main(String[] args) {
        Josephus j =new Josephus();
        System.out.println(j.josephus(5, 2)+1);
    }
}