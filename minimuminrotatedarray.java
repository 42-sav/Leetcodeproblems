class Solution {
    public int findMin(int[] nums) {
        int n = nums.length-1;
         
        int result = 0;
        int i=0;
       
        //find the middle element and find if its larger than the next integer and if larger then return the right side of the array and the first int in teh right is the minimum

//iterate using while loop and use recusrion binary search 
        while(i<n){
            int mid = i + (n-i)/2;
            if(nums[mid]>nums[n]){
                i = mid+1;
            }
            if(nums[mid]<nums[n]){
                n = mid;
            }
            
        }
        return nums[i];
    }
}
