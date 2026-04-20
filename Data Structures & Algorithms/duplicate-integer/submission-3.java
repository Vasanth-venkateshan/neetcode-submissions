class Solution {
    public boolean hasDuplicate(int[] nums) {

      HashSet<Integer> set = new HashSet<>();

      for(int num: nums)//1.,2,3,3
      {
         if(set.contains(num))//(0=1)(1=2)(1,2=3),(1,2,3=3)->true
         {
            return true;
         }
         set.add(num);//1,2,3
      }
      return false;

      //TC=O(n)
     // SC=O(1)


 
        
    }
}