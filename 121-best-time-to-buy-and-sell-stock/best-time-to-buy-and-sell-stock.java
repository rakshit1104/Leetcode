class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int maxPrice = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            minPrice = Math.min(minPrice, arr[i]);
            maxPrice = Math.max(maxPrice, arr[i] - minPrice);
        }
        return maxPrice;
    }
}