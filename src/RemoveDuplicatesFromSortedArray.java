import java.util.HashMap;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        Integer[] expectedNums;

        for (int num : nums) map.put(num, num);

        expectedNums = map.values().toArray(new Integer[0]);

        return expectedNums.length;
    }

    public static void main(String[] args){
        var array = new int[]{1,1,2};
        new RemoveDuplicatesFromSortedArray().removeDuplicates(array);
    }
}
