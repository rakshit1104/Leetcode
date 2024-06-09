class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MIN_VALUE;
        int count1 = 0, count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(count1 == 0 && ele2 != nums[i]){
                count1++;
                ele1 = nums[i];
            } else if(count2 == 0 && ele1 != nums[i]){
                count2++;
                ele2 = nums[i];
            } else if(nums[i] == ele1){
                count1++;
            } else if(nums[i] == ele2){
                count2++;
            } else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int i = 0; i < nums.length; i++){
            if(ele1 == nums[i]) count1++;
            if(ele2 == nums[i]) count2++;
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int major = (int) Math.floor(nums.length/3) + 1;

        if(count1 >= major) ans.add(ele1);
        if(count2 >= major) ans.add(ele2);

        Collections.sort(ans);
        return ans; 
    }
}