public class FirstAndLastPos {

    int firstPosition(int arr[],int target){
        int l=0,h=arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                ans=mid;
                h=mid-1;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }
    int lastPosition(int arr[],int target){
        int l=0,h=arr.length-1;
        int ans=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                ans=mid;
                l=mid+1;
            }else if(arr[mid]<target){
                l=mid+1;
            }else{
                h=mid-1;
            }
        }
        return ans;
    }


}