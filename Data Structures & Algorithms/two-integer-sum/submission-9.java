class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int comp=target-nums[i];//

            if(map.containsKey(comp))
            {
                return new int[]{map.get(comp),i};//return comp value and current loop index
            }

            map.put(nums[i],i);//add current loop array as key and index as value.
        }
        return new int[]{};
        
    }
}
