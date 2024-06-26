class Solution {
    public int func(int[] arr, int mid){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += Math.ceil((double)(arr[i]) / (double)(mid));
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }

        int low = 1, high = max;
        while(low <= high){
            int mid = (low+high)/2;

            if(func(nums, mid) <= threshold){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return low;
    }
}