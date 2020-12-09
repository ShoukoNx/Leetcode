class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int first = 0;first<n;first++){
            if(first>0&&nums[first]==nums[first-1]){
                continue;
            }
            int third = n-1;
            int target = -nums[first];

            for(int second = first+1;second<n;second++){
                if(first==second||first==third){
                    continue;
                }
                if(second>first+1&&nums[second]==nums[second-1]){
                    continue;
                }
                while(second<third&&nums[second]+nums[third]>target){
                    third--;
                }
                if(second==third){
                    break;
                }
                if(nums[second]+nums[third]==target){
                    List<Integer> tag = new ArrayList<>();
                    tag.add(nums[first]);
                    tag.add(nums[second]);
                    tag.add(nums[third]);
                    ans.add(tag);
                }
            }


        }


        return ans;

    }
}