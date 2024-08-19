class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                nums[i] = 0;
            } else{
                nums[i] = 1;
            }
        }

        return atMost(nums, k) - atMost(nums, k - 1);
    }

    private int atMost(int[] nums, int goal) {
        if(goal<0) return 0;
        int count=0, i=0, j=0, sum=0;

        while(i<nums.length) {
            sum+=nums[i]; 
            while(j<nums.length && sum>goal) {
                sum-=nums[j];
                j++;
            }
            count+=i-j+1;
            i++;
        }

        return count;
    }
}