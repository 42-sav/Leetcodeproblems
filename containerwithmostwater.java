class Solution {
    public int maxArea(int[] height) {
        //find the start and end and area 
        int start = 0;
        int end=height.length-1;
        int mid = height.length/2;
        //int[] area ;
        List<Integer> area = new ArrayList<Integer>();
        int res = 0;

        for( start=0;start<=mid;start++){
            
            area.add(height[start]*height[end]);
            end= end--;
        }
        for(int i =0;i<=area.size()-1;i++){
            if(i>res){
                res = i;
            }
        }
        //1 test case passed , need to think of other ways 


     return res;   
    }
    
}