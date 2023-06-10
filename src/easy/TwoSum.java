package easy;

import java.util.HashMap;

public class TwoSum {

    // time: n + n-1 = 2n-1
    // space: n
    public int[] twoSum(int[] nums, int target){
        var results = new int[2];
        var intMap = getIntMap(nums);

        // time: o(n-1). where n is number of ints in the array
        for(int i=0; i<nums.length; i++){
            var temp = target-nums[i];

            if(intMap.containsKey(temp)) {
                results[0] = i;
                results[1] = intMap.get(temp);
                break;
            }
        }

        return results;
    }

    // time: o(n). where n is number of ints in the array
    //space: o(n)
    public HashMap<Integer, Integer> getIntMap(int[] nums){
        var numsMap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            numsMap.put(nums[i], i);
        }

        return numsMap;
    }


    public static void main(String[] args){
        var nums = new int[]{2, 7, 11, 15};
        var result = new TwoSum().twoSum(nums, 9);

        System.out.println(result[0] + " " + result[1]);
    }

}
