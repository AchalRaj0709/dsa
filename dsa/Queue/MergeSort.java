public class MergeSort {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int i=si; //idx for 1st sorted array
        int j=mid+1; //idx for 2nd sorted array
        int k=0; //idx for temp array
        int temp[]=new int[ei-si+1];

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else{
                temp[k++]=arr[j++];
            }
        }
        //for leftover in 1st sorted array
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for leftover in 2nd sorted array
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp into original array
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        int arr[]={6,2,3,9,5,2,8,-5};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}