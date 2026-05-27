public class ArraySum { //arr={1,2,3,4,5,2} output=[2,4] ,target=12
    void sum(int[] arr, int k) {
        int sum=0, s=0;
        for(int e=0;e<arr.length;e++){
            sum=sum+arr[e];
            while(sum>k){
                sum-=arr[s];
                s++;
            }
            if(sum==k){
                System.out.println(s+1);
                System.out.println(e+1);
                break;
            }
        }

}
public static void main(String[] args) {
    ArraySum a=new ArraySum();
    int[] arr={1,2,3,7,5};
    a.sum(arr, 12);
}
}