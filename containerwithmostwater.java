class Solution {
    public int maxArea(int[] height) {
        //find the start and end and area 
        int start = 0;
        int end=height.length-1;
        //int mid = height.length/2;
        //int[] area ;
        //List<Integer> area = new ArrayList<Integer>();
        int res = 0;

        //boolean flag = true;
        //think of two pointer methods and conditions,select one pointer from start and one for end and then move the smaller pointer as we want max area and if we have equal move both as we have calculated both then its of no use coz we can fill only till minimum of the  heights.

        while(start<end){
            int width = end - start;
            int h = Math.min(height[start],height[end]);
            int area = width*h;
             res = Math.max(res,area);

            if(height[start] < height[end]){
                start++;
            }
            else if (height[start]>height[end]){
                end--;
            }
            else{
                start++;
                end--;
            }
            
            
           // end= end--;
        }
        


     return res;   
    }
    
}