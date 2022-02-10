class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int compl = target - nums[i];
            if(map.containsKey(compl))
                return new int[] {i, map.get(compl)};
            map.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No Matches Found");
    }
}
