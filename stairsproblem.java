class Solution {
    public int climbStairs(int n) {
        //combination problem ,find factorial and apply the formula-wrong approach
        //use the test cases and find patterns 
        int fact = 1;
        int res = 0;
        for(int i = 1,i<=n;i++){
            fact = fact * i;
        }
        if(n = 1){
            res = 1;
        }
        else{
            res = fact
        }


        
    }
}