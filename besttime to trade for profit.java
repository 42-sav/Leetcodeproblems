iterate array and assign the small variable value , check which is the next largest profit by subtracting small from the iterating values of input and return profit

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        //int s =new int[2];
        int small = Integer.MAX_VALUE;
        int profit = 0;
        int  x = 0;
        //int index2 = 0;

        //Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<n;i++){
            if(prices[i]<small){
                //map.put(prices[i],i);
                small=prices[i];
                //index = i;

            }
            //profit = prices[i]-small;
            x = prices[i]-small;
            if(profit<x){
                profit = x;
            }
           


        }
         return profit;
       
        
        
    }
}