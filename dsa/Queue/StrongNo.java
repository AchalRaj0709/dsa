import java.util.Scanner;

public class StrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int d=0,s=0,f=1;
        while(n!=0){
            d=n%10;
            f=1;
            for(int i=1;i<=d;i++){
                f=f*i;
            }
            s=s+f;
            n/=10;
        }
        if(s==temp){
            System.out.println("strong no");
        }
        else{
            System.out.println("Not");
        }
        sc.close();
    }
}
