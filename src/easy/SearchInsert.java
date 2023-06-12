package easy;

// we divide by two each time, time complexity = log2(n)
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {

        var start = 0;
        var end =nums.length-1;
        int midPoint = 0;

        while (start<=end) {
            midPoint = start+end/2;

            if (nums[midPoint] == target) {
                return midPoint;
            }

            else if (nums[midPoint] < target) {
                start = midPoint+1;
            }

            else {
                end = midPoint-1;
            }

        }

        return end+1;
    }

    public static void main(String[] args){
        var intArray = new int[]{5,7,8,9};

        var result = new SearchInsert().searchInsert(intArray, 4);

        System.out.println(result);
    }
}
