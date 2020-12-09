class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
        if(strs.length==1) return strs[0];
        String ans="";
        int col = 0;
        int row = strs.length;
        for(String str : strs){
            col = Math.max(col,str.length());
        }
        char[][] s = new char[row][col];
        int j =0;
        for(String str:strs){
            for(int i =0;i<str.length();i++){
                s[j][i]=str.charAt(i);


            }
            j++;
        }

        for(int i =0;i<col;i++){
            for(j=0;j<row-1;j++){
                if(s[j][i]!=s[j+1][i]) return ans;
                if(j==row-2) ans += s[0][i];


            }
        }

        return ans;


    }
}