import java.util.*;
public class JavaBAsics{
    public static int decimalToBinary(int n){
        int binary=0,rem=0,pow=0;
        while(n>0){
            rem=n%2;
            binary=binary+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;
        }
        return binary;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int binary=decimalToBinary(n);
        System.out.println("Number Converted= "+ binary);
        sc.close();
    }
}