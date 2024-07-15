class Solution {
    public String reverseWords(String s) {
        String[] string = s.trim().split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = string.length-1; i>0; i--){
            sb.append(string[i] + " ");
        }
        sb.append(string[0]);
        return sb.toString();
    }
}