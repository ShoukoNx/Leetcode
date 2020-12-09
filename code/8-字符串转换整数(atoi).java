class Solution {
    public int myAtoi(String s) {
        StringBuffer sb = new StringBuffer();
        boolean isPositive = true;
        char cur = 'b';
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if( (c <'0' || c > '9') && c != '+' && c != '-' && c != ' '){
                break;
            }

            if(cur == 'b'){
                if(c == ' '){
                    cur = 'b';
                    continue;
                }else if(c == '-'){
                    cur = 's';
                    isPositive = false;
                    continue;
                }else if(c == '+'){
                    cur = 's';
                    continue;
                }else if(c >= '0' && c <= '9'){
                    cur = 'd';
                    sb.append(c);
                    continue;
                }
            }else if(cur == 's'){
                if(c >= '0' && c <= '9'){
                    cur = 'd';
                    sb.append(c);
                    continue;
                }else if(c == '-' || c == '+' || c == ' '){
                    break;
                }
            }else if(cur == 'd'){
                if(c >= '0' && c <= '9'){
                    sb.append(c);
                    continue;
                }else{
                    break;
                }
            }
        }
        if(sb.length() == 0){
            return 0;
        }
        String temp = sb.toString();
        int ans = 0;
        try{
            ans = Integer.valueOf(temp);
        }catch(Exception e){
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }    
        return isPositive ? ans : -ans;
    }
}