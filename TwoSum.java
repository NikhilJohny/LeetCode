// 1. Two Sum

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int index1 = -1,index2 = -1;
        int arr[] = Arrays.copyOf(nums,nums.length);
        Arrays.sort(arr);
        int val1 = Integer.MIN_VALUE, val2 = Integer.MIN_VALUE;
        int front = 0, rear = nums.length - 1;
        while(front < rear){
            if(arr[front] + arr[rear] == target){
                val1 = arr[front];
                val2 = arr[rear];
                break;
            }
            if(arr[front] + arr[rear] > target)
                rear--;
            else
                front++;  
        }
        if(val1 != Integer.MIN_VALUE){
            int counter = 0;
            for(int i = 0; i < nums.length; i++){
                System.out.println(nums[i]);
                if(val1 != Integer.MIN_VALUE && nums[i] == val1){
                    if(index1 == -1){
                      val1 = Integer.MIN_VALUE;
                    index1 = i;  
                    }else{
                        val1 = Integer.MIN_VALUE;
                        index2 = i;
                    }
                    continue;
                }
                if(val2 != Integer.MIN_VALUE && nums[i] == val2){
                   if(index1 == -1){
                      val2 = Integer.MIN_VALUE;
                        index1 = i;  
                    }else{
                        val2 = Integer.MIN_VALUE;
                        index2 = i;
                    }
                }
                if(index1 != -1 && index2 != -1)
                    break;
            }
        }
        return new int[] {index1,index2};
    }
}