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
                break;
            }

            else if (nums[midPoint] < target) {
                start = midPoint+1;
            }

            else {
                end = midPoint-1;
            }

        }

        if(nums[midPoint]<target)
            midPoint++;

        return midPoint;
    }

    public static void main(String[] args){
        var intArray = new int[]{1, 3, 5, 6, 8, 10, 20};

        var result = new SearchInsert().searchInsert(intArray, 6);

        System.out.println(result);
    }
}
