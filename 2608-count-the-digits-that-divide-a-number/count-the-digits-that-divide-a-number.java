class Solution {
    public int countDigits(int num) {
        int count = 0;
        int x = num;
        while (x > 0) { 
            int digit = x % 10; 
            x /= 10;
            if(num % digit == 0) count++;
        }
        return count;
    }
}