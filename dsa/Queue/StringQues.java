//input: Anup Kumar Tiwari
//output: A.K.Tiwari
public class StringQues {
    public static void main(String[] args) {
        String str="Gurkirat Singh Shetty";
        String[] arr=str.split(" ");
        String res="";
        for(int i=0;i<arr.length-1;i++){
            res=res+arr[i].charAt(0)+".";
        }
        res=res+arr[arr.length-1];
        System.out.println(res);
    }
}
