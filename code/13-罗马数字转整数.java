class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        for(int i = 0; i<s.length()-1;i++){
            int p = tran(s.charAt(i));
            int q = tran(s.charAt(i+1));
            
            if(p>=q){
                ans += p;
            }else {
                ans -= p;
            }
        }
        
        ans += tran(s.charAt(s.length()-1));
        return ans;


    }

    static int tran(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:return 0;
        }
    }
}