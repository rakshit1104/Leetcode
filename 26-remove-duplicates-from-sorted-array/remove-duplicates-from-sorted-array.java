class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
            arr[i+1] = arr[j];
            i++;
            }
        }
        return i+1;
    }
}