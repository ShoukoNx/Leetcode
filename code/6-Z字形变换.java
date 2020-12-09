class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        char[][] ch = new char[numRows][s.length()];
        int row = 0, column = 0, i = 0;
        while( i < s.length() ){
            while( row < numRows ){
                if(i >= s.length() ) break;
                ch[row][column] = s.charAt(i);
                i++;
                row++;
            }
            row = row - 2;
            column++;
            while( row > 0 ){
                if(i >= s.length() ) break;
                ch[row][column] = s.charAt(i);
                i++;
                row--;
                column++;
            }
        }
        return convertToString(ch);
    }

    public String convertToString(char[][] ch){
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < ch.length; i++){
            for(int j = 0; j < ch[0].length; j++){
                if( ch[i][j] != '\u0000' ){
                    sb.append(ch[i][j]);
                }
            }
        }

        return sb.toString();
    }
}