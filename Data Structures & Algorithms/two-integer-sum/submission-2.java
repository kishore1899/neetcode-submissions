class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();



for (int i = 0; i < nums.length; i++) {
    int complement = target - nums[i];
    if(map.containsKey(complement)){
    return new int[]{map.get(complement), i};

    }

    map.put(nums[i],i);

}

        // int index=0;
        // for (int num : nums) {
        //     map.put(num,index);
        //     index ++;
        // }

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        //  int i = entry.getKey();
        //  int a = target - i;
        //  if(map.containsKey(a)){
        //  return new int[]{entry.getValue(), map.get(a)};
        //  }
        // }  
         return new int[2] ;

    }
}
