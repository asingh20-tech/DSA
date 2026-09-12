import java.util.Arrays;

// Solution 1
public int LongestConsecutive(int[] nums) {
    if (nums.length == 0) {
        return 0;
    }

    Arrays.sort(nums);

    int count = 1;
    int max = 1;

    for (int i = 0; i < nums.length - 1; i++) {

        if (nums[i + 1] - nums[i] == 1) {
            count++;
        }
        else if (nums[i + 1] == nums[i]) {
            continue;
        }
        else if (max < count){
            max = Math.max(max, count);
            count = 1;
        }
    }

    return Math.max(max, count);
}

// Solution 2


//class Solution {
//    public int longestConsecutive(int[] nums) {
//
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(nums);
//
//        int count = 1;
//        int max = 1;
//
//        for (int i = 0; i < nums.length - 1; i++) {
//
//            if (nums[i + 1] - nums[i] == 1) {
//                count++;
//            }
//            else if (nums[i + 1] == nums[i]) {
//                continue;
//            }
//            else {
//                if (count > max) {
//                    max = count;
//                }
//
//                count = 1;
//            }
//        }
//
//        if (count > max) {
//            max = count;
//        }
//
//        return max;
//    }
//}

