class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int temp = x;
        int num = 0;

        while(temp > 0){
            int digit = temp % 10;
            num = (num*10) + digit;
            temp /= 10;
        }

        
        return (num == x);
    }
}