package easy;

import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        Integer[] expectedNums;

        for (int i=0; i<nums.length; i++)
            map.put(nums[i], nums[i]);

        expectedNums = map.values().toArray(new Integer[0]);

        return expectedNums.length;
    }
}
