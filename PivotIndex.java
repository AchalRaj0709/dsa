public class PivotIndex {
    public static int findMiddleIndex(int[] nums){
        int prefix[]=new int[nums.length];
        int postfix[]=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        postfix[nums.length - 1] = nums[nums.length - 1];
        for(int i=nums.length-2;i>=0;i--){
            postfix[i]=nums[i]+postfix[i+1];
        }
        for(int i=0;i<nums.length;i++){
            int leftSum = prefix[i] - nums[i];
            int rightSum = postfix[i] - nums[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums={2,3,-1,8,4};
        System.out.println(findMiddleIndex(nums));
    }
}