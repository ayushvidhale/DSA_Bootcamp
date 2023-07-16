package LeetCode;
// https://leetcode.com/problems/two-sum/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}


// import java.util.HashMap;
// import java.util.Map;
 
// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> numToIndex = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             if (numToIndex.containsKey(target - nums[i])) {
//                 return new int[] {numToIndex.get(target - nums[i]), i};
//             }
//             numToIndex.put(nums[i], i);
//         }
//         return new int[] {};
//     }
// }

