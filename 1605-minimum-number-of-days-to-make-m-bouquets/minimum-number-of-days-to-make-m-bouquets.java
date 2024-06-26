class Solution {
    public int min(int[] arr){
        int ans = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            ans = Math.min(ans, arr[i]);
        }
        return ans;
    }

    public int max(int[] arr){
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public int func(int[] arr, int m, int k, int mid){
        int count = 0;
        int bouq = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= mid){
                count++;
            } else{
                bouq = bouq + (count/k);
                count = 0;
            }
        }
        bouq = bouq + (count/k);
        return bouq;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        if (val > bloomDay.length) return -1;
        
        int low = min(bloomDay);
        int high = max(bloomDay);

        while(low <= high){
            int mid = (low+high)/2;
            if(func(bloomDay, m, k, mid) >= m){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return low;
    }
}