//arr={1,0,2,0,1,0}
//{1,2,1,0,0,0}
public class MoveZero {
    public static void main(String[] args) {
        int arr[]={1,0,2,0,1,0};
        int temp=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            }else if(c>0){
                temp=arr[i];
                arr[i]=0;
                arr[i-c]=temp;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}