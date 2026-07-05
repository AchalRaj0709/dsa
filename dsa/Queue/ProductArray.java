public class ProductArray {
    int product(int[] arr,int n){
        if(n==0){
            return 1;
        }
        return arr[n-1]*product(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ProductArray pr=new ProductArray();
        System.out.println(pr.product(arr, 0));
        
    }

}