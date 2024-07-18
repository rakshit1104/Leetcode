class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        Map.Entry<Character, Integer> firstEntry = map.entrySet().iterator().next();
        int count = firstEntry.getValue();

        for (Map.Entry<Character, Integer> e : map.entrySet()){
            if(e.getValue() == count){
                continue;
            } else{
                return false;
            }
        }
        return true;
    }
}