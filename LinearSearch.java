public class LinearSearch {

    int linear(int[] arr,int k){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LinearSearch l=new LinearSearch();
        int[] arr={2,3,8,1,6,7};
        int k=8;
        System.out.println(l.linear(arr, k));
    }
}