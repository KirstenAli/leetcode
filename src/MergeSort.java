import static java.util.Arrays.copyOfRange;

public class MergeSort {

    public int[] mergeSort(int [] nums){
        if(nums.length ==1)
            return nums;

        else if(nums.length ==2){
            if (nums[0] >nums[1]) {
                var temp = nums[0];

                nums[0] =nums[1];
                nums[1] = temp;
            }

            return nums;
        }

        var midPoint = nums.length/2;

        var subListA = mergeSort(copyOfRange(nums, 0, midPoint));
        var subListB = mergeSort(copyOfRange(nums, midPoint, nums.length));

        return merge(subListA, subListB);
    }

    public int[] merge(int[] a, int[]b){
        var merged = new int[a.length + b.length];
        var mergedCounter =0;
        var aCounter =0;
        var bCounter =0;

        while (aCounter<a.length && bCounter<b.length){
            if(a[aCounter]<=b[bCounter]) {
                merged[mergedCounter] = a[aCounter];
                aCounter++;
            }

            else{
                merged[mergedCounter] = b[bCounter];
                bCounter++;
            }

            mergedCounter++;

        }

        while (aCounter < a.length) {
            merged[mergedCounter] = a[aCounter];
            aCounter++;
            mergedCounter++;
        }

        while (bCounter < b.length) {
            merged[mergedCounter] = b[bCounter];
            bCounter++;
            mergedCounter++;
        }

        return merged;
    }


    public static void main(String[]args){

        var arrayA = new int[]{3,1};
        var arrayB = new int[]{1,2};

        var result = new MergeSort().merge(arrayA, arrayB);

        for(int i: result){
            System.out.println(i);
        }
    }
}
