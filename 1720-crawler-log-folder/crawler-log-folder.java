class Solution {
    public int minOperations(String[] logs) {
        int count = 0;

        for(int i = 0; i < logs.length; i++){
            if(logs[i].equals("./") || (logs[i].equals("../") && count == 0)){
                continue;
            } else if(logs[i].equals("../")){
                count--;
            } else{
                count++;
            }
        }
        return count;
    }
}