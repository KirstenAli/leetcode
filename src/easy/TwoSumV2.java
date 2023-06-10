package easy;

import easy.TwoSum;

import java.util.HashMap;

// in this version we improve the time complexity from 2n-1 to n-1
public class TwoSumV2 {

    // time: n-1
    // space: n
    public int[] twoSum(int[] nums, int target){
        var results = new int[2];
        var intMap = new HashMap<Integer, Integer>();

        // time: o(n-1). where n is number of ints in the array
        for(int i=0; i<nums.length; i++){
            var temp = target-nums[i];

            if(intMap.containsKey(temp)) {
                results[0] = i;
                results[1] = intMap.get(temp);
                break;
            }

            intMap.put(temp, i);
        }

        return results;
    }

    public static void main(String[] args){
        var nums = new int[]{2, 7, 11, 15};
        var result = new TwoSum().twoSum(nums, 9);

        System.out.println(result[0] + " " + result[1]);
    }
}
