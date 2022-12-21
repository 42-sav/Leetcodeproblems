Hashset can store only unique values

class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        boolean result = true;
        //Map<Integer,Integer> map = new HashMap<>();
        //List<Integer> list = new ArrayList<Integer>();
        Set<Integer> uniqueValues = new HashSet<Integer>();
        for(int i=0;i<n;i++){

           uniqueValues.add(nums[i]);

        }
        
        if(uniqueValues.size() == nums.length){
            result=false;
        }
        
        return result;
        
    }
}