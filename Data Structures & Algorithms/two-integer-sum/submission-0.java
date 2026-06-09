class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int goal=target-nums[i];
        if(mp.containsKey(goal)){
            return new int[]{mp.get(goal),i};  
        }
        mp.put(nums[i],i);
       } 
       return new int[0];
    }
}
