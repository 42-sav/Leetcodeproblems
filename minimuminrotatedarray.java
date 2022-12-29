class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int mid = n/2;
        int result = 0;
        int i=0;
        //find the middle element and find if its larger than the next integer and if larger then return the right side of the array and the first int in teh right is the minimum
        if(mid==0){
             result=nums[0];
           
        }
        else if(mid>1 && nums[mid]>nums[mid+1]){//index out of bounds for 2 elememt array,try to solve without using mid+1 (solved)
           
             result = nums[mid+1];

        }
        else{
            while(i<mid){
                if(nums[i]<nums[i+1]){
                    result = nums[i];
                    break;
                }
                else{
                    result=nums[0];
                    break; //61 test cases passed 
                }
            }
        }
        return result;
    }
}