class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(Character x : s.toCharArray()){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(Character x : t.toCharArray()){
            map.put(x,map.getOrDefault(x,0)-1);
        }
        for(int i:map.values()){
            if(i>=1) return false;
        }return true;
        
    }
}
