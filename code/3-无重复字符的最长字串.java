class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.equals("")) return 0;
        char[] a = s.toCharArray();
        int j =0;
        Set<Character> set = new HashSet<>();
        int cnt = 1;
        for(int i =0;i<a.length;i++){
            if(set.contains(a[i])){
                while(set.contains(a[i])||i<j){
                    set.remove(a[j]);
                    j++;
                }
            }
            set.add(a[i]);

            cnt = Math.max(cnt,i-j+1);
        }
        return cnt;
    }
}