import java.util.HashMap;
import java.util.Map;

//find the two indices of the given array whose sum equals to the given target



class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length; //get the lenght of the input to iterate the array using forloop
        Map<Integer,Integer> map = new HashMap<>();//create a map which stores in the value of the given array in each iteration of forloop
        int result[] = new int[2];//create a result array
            for(int i =0;i<=n;i++){
                if(map.containsKey(target-nums[i])){ //if the target value minus the the current iterating values match,then we return the result of the index of target-current value and the current index 
                    result[1]=i; 
                    result[0]=map.get(target-nums[i]);
                    
                    return result;
                }
                
                map.put(nums[i],i);
                
            
            
            
        }
        return result;
        
    }
}