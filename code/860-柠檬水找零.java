class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] wallet = new int[3];
        for(int n : bills){
            if(n == 5){
                wallet[0]++;
            }else if(n == 10){
                if(wallet[0] == 0){
                    return false;
                }else{
                    wallet[0]--;
                    wallet[1]++;
                }
            }else if(n == 20){
                wallet[2]++;
                if(wallet[0] == 0 && wallet[1] == 0){
                    return false;
                }else{
                    if(wallet[1] > 0){
                        wallet[1]--;
                        if(wallet[0] == 0){
                            return false;
                        }else{
                            wallet[0]--;
                        }
                    }else{
                        if(wallet[0] > 3){
                            wallet[0] -= 3;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}