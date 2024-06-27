class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n =  position.length;

        int low = 1;
        int high = position[n-1] - position[0];
        while(low <= high){
            int mid = (low+high)/2;

            if(func(position, mid, m)){
                low = mid+1;
            } else{
                high = mid-1;
            }
        }
        return high;
    }

    public boolean func(int[] arr, int gap, int total) {
        int n = arr.length;
        int count = 1;
        int last = arr[0];

        for(int i = 1; i < n; i++){
            if(arr[i]-last >= gap){
                count++;
                last = arr[i];
            }
            if (count >= total) return true;
        }
        return false;
    }
}