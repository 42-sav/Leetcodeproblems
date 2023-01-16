class Solution {
    public int climbStairs(int n) {
        //combination problem ,find factorial and apply the formula-wrong approach
        //use the test cases and find patterns 
        int a =1;
        int b=2;
        int out = 0;

        if(n<=2){
            return n;

        }
        for(int i=3;i<=n;i++){
            int res = a+b;
            a=b;
            b=res;
            out=res;
            
        }
        return out;
    }
    
}