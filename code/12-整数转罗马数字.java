class Solution {
    public String intToRoman(int num) {
        String[] set = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X","IX","V","IV","I"};
        int[] numSet = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuffer sb = new StringBuffer();
        while(num > 0){
            for(int i = 0; i < numSet.length; i++){
                if(num >= numSet[i]){
                    num -= numSet[i];
                    sb.append(set[i]);
                    break;
                }
            }
        }
        return sb.toString();
        
    }
}