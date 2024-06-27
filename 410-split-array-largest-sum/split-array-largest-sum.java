class Solution {
    public int func(int[] nums, int capacity){
        int days = 1, load = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] + load > capacity){
                days += 1;
                load = nums[i];
            } else{
                load += nums[i];
            }
        }
        return days;
    }
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for(int i = 0; i  < nums.length; i++){
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }

        while(low <= high){
            int mid = (low+high)/2;
            if(func(nums, mid) <= k){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return low;
    }
}