//input:['h','e','l','l','o']
//output:['o','l','l','e','h']

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        int l=0;
        int r=s.length-1;
        while(l<r){
            char temp=s[l];
            s[l]=s[r];
            s[r]=temp;
            l++;
            r++;
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}