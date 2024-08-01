class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        String age = "";
        for(int i = 0; i< details.length; i++){
            if(details[i].length() <= 10) return -1;
            age = age + details[i].charAt(11) + details[i].charAt(12);
            if(Integer.parseInt(age) > 60) count++;
            age = "";
        }
        return count;
    }
}