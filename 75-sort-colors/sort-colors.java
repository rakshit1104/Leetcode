class Solution {
    void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public void sortColors(int[] arr) {
        int n = arr.length;
        int low = 0, mid = 0, high = n-1;
        
        while(mid <= high){
            if(arr[mid] == 0){
                swap(arr, low, mid);
                mid++;
                low++;
            } else if(arr[mid] == 1){
                mid++;
            } else{
                swap(arr, mid, high);
                high--;
            }
        }
    }
}