//414. Third Maximum Number

import java.util.*;
import java.util.Collections;
class Solution {
    public int thirdMax(int[] nums) {
        Vector<Integer> arr = new Vector<Integer>();
		Arrays.sort(nums);
        if(nums.length == 0)
            return 0;
        if(nums.length < 3)
            return nums[nums.length - 1];
        int last = Integer.MAX_VALUE;
        for(int i : nums)
        {
            if(i != last)
            {
                last = i;
                arr.add(last);
            }
        }
        return (arr.size() < 3) ? arr.get(arr.size() - 1) : arr.get(arr.size() - 3);
    }   
}