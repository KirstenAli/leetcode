
public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        var length = nums.length-1;
        var start = 0;
        var end =length;
        int midPoint;

        while (true) {
            var range = end-start;
            midPoint = start+range/2;

            if (nums[midPoint] == target) {
                break;
            }

            else if(range==0){
                if(nums[midPoint]<target)
                    midPoint++;
                break;
            }

            else if (nums[midPoint] < target) {
                start = midPoint+1;
            }

            else {
                end = midPoint-1;
            }

        }

        return midPoint;
    }

    public static void main(String[] args){
        var intArray = new int[]{1, 3, 5, 6, 8, 10, 20};

        var result = new SearchInsert().searchInsert(intArray, 2);

        System.out.println(result);
    }
}
