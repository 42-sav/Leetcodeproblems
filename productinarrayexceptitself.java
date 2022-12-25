class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        int[] result = new int[n];
        //create two arrays one for the left of the number we are iterating and one for the right of the number,then fill the the initial space with 1 and then multiply both the arrays
//try to think in products of two arrays when a product of array is asked
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=nums[i-1]*left[i-1];

        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++){
            result[i]=left[i]*right[i];
        }
        return result;

        
    }
}