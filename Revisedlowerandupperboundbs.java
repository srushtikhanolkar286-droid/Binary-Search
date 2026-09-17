class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low =0;
        int n = nums.length;
        int high = n-1;
        int[] ans = {-1,-1};
        ans[0] = lb(nums,target);
        ans[1] = ub(nums,target);
        return ans;
    }
    private int lb(int[] nums, int target){
        int low=0, high = nums.length -1;
        int first = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid]>=target){
                if(nums[mid]==target){
                    first = mid;
                }
                high = mid -1;
            }
            else{
                low= mid + 1;
            }
        }
        return first;
    }
    private int ub(int[] nums, int target){
        int low=0, high = nums.length -1;
        int last = -1;
        while(low<=high){
            int mid = (low + high)/2;
            if(nums[mid]<=target){
                if(nums[mid]==target){
                    last = mid;
                }
                low= mid + 1;
               
            }
            else{
                 high = mid -1;
            }
        }
        return last;
    }
}
