class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        return find(nums, target, low, high);
    }

    int find(int[] arr, int target, int low, int high){
        int mid = low + ((high-low)/2);
        if(low > high){
            return -1;
        }

        if(arr[mid] == target){
            return mid;            
        } else if(target > arr[mid]){
            return find(arr, target, mid+1, high);
        }
        return find(arr, target, low, mid-1);
    }
}