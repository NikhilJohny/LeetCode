// 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int result = Integer.MIN_VALUE;
        for(int i : nums){
            if(!set.add(i)){
                result = i;
                break;
            }
        }
        return result;
    }
}