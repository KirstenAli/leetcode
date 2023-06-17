package easy;
// with this approach we are not using a hashset to store the numbers to the space complexity in reduced to constant
// time is in n, where n is the amount of nums.

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {

        int i=0;
        int j =0;
        int next = i+1;

        while(i<nums.length-1){

            if(nums[i]<nums[next]){
                nums[j] = nums[i];
                j++;
            }

            i++;
            next=i+1;
        }

        nums[j] = nums[i];

        return j+1;
    }
}
