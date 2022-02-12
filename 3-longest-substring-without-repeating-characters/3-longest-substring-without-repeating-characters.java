public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int max = 0, i = 0, j = 0;
        
        for(j = 0; j < s.length(); j++)
        {
            if(!map.containsKey(s.charAt(j)))
            {
                map.put(s.charAt(j), j+1);
            }
            else
            {
                i = Math.max(i, map.get(s.charAt(j)));
                map.put(s.charAt(j), j+1);
            }
            max = Math.max(max, j-i + 1);
        }
        return max;
    }
    
}