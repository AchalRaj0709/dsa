public class BinarySearch {

    int binarySearch(int[] arr,int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
           int mid=(left+right)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch b=new BinarySearch();
        int arr[]={1,2,5,7,8,9,10};
        int k=7;
        System.out.println(b.binarySearch(arr, k));
    }
}