class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int x, y, jw = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        while(i >= 0 || j >= 0 || jw > 0){
            x = i >= 0 ? Character.getNumericValue(a.charAt(i)) : 0;
            y = j >= 0 ? Character.getNumericValue(b.charAt(j)) : 0;
            int r = x + y + jw;
            char c =  r == 1 || r == 3? '1' : '0';
            jw = r >= 2? 1 : 0;
            sb.insert(0,c);
            i--;
            j--;
        }
        return sb.toString();
    }
}
