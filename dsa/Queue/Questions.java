public class Questions{
    public static int kthLargestNumber(int[] nums,int k){
        int max=Integer.MIN_VALUE,pos=0;
        for(int i=1;i<=k;i++){
            max=Integer.MIN_VALUE;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>max){
                    max=nums[j];
                    pos=j;
                }
            }
            nums[pos]=Integer.MIN_VALUE;
        }
        return max;

    }
    public static void main(String[] args) {
        // int[] nums={3,2,1,5,6,4};
        // int k=2;
        // int max=kthLargestNumber(nums, k);
        // System.out.println("kth largest element:"+max);
        int rev=0,x=1534236469;
        int y=1534236469;
        System.out.println(y);
        while(y>0){
            int digit=y%10;
            rev=rev*10+digit;
            y/=10;
        }
        System.out.println(rev+" "+x+" "+y);
    }
}