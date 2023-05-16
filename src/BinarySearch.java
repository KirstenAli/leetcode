import static java.util.Arrays.copyOfRange;
// time: we divide by two each time so log n
public class BinarySearch {
    public boolean binarySearch(int[] nums, int target) {
        var length = nums.length;
        var midPoint = length/2;
        var found = false;

        if(nums[midPoint] ==target){
            found =true;
        }

        else if(length==1){
            return false;
        }

        else if(nums[midPoint] < target){
            found = binarySearch(copyOfRange(nums, midPoint+1, length), target);
        }

        else {
            found = binarySearch(copyOfRange(nums, 0, midPoint), target);
        }

        return found;

    }

    public static void main(String[] args){
        var intArray = new int[]{1, 2, 3, 4, 5, 6, 8, 10, 20};

        var result = new BinarySearch().binarySearch(intArray, 21);

        System.out.println(result);
    }
}
