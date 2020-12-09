class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        Map<Integer,Integer> m = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            m.put(nums[i],i);
        }
        for(int i =0;i<nums.length;i++){
            int c = target - nums[i];
            if(m.containsKey(c) && m.get(c)!=i){
                r = new int[]{i, m.get(c)};
            }
        }
        return r;
    }
}