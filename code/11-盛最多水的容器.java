class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left =0, right = height.length -1;
        while(left < right){
            int h = Math.min(height[left], height[right]);
            int temp = (right - left) * h;
            ans = Math.max(ans, temp);
            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }
        return ans;

    }
}