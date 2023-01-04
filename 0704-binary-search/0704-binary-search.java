class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        
        for(int ind=0; ind<n; ind++)
        {
            if(nums[ind] == target){
                return ind;
            }
            
        }
        
        return -1;
    }
}