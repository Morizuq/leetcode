fun twoSum(nums: IntArray, target: Int): IntArray { 
     // {complement: index} 
      var map = HashMap<Int, Int>();

      for (i in nums.indices){
        var complement = target - nums[i];
        // If complement exists, return its index, i
        if (map.containsKey(complement)){
            return intArrayOf(map[complement]!!, i)
        }
        
        map[nums[i]] = i;
      }

      return intArrayOf();
}
