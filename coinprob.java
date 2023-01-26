class Solution {
    public int coinChange(int[] coins, int amount) {
        //find pattern and solve ,find the biggest number in the array and then subtract and keep remainder ina variable and if the remainder is bigger than the biggest number then iterate and if its smaller then find the second biggest number with which we can subtract
        int rem = 1;
        int len = coins.length - 1;
        int amt = amount;
        int[] coins1;
        int i = 0;
        if(amount == 0){
            return amt;
        } 
        //cant sort primitive types so find alternative
        //coins1 = Arrays.sort(coins, Collections.reverseOrder());
        //Arrays.sort(coins);
        //coins1 = reverse(coins);
        if(amount>coins1[0] && len == 0){
            amt = -1 ;
            return amt;
        }
        else{
            while(rem != 0){
                if(amt>coins1[i]){
                    amt = amt % coins1[i];
                    rem = amt;
                }
                else{
                    i++;
                    amt = amt % coins1[i];
                    rem = amt;
                }

            }
        }


        

        
    }
}