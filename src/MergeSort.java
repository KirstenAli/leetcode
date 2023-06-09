import static java.util.Arrays.copyOfRange;

public class MergeSort {

    public int[] mergeSort(int [] nums, int start, int end){
        var midPoint = (start+end)/2;
        var range = end-start;

        if(range ==0)
            return new int[]{nums[start]};

        else if(range ==1){

            if (nums[start] >nums[end])
                return  new int[]{nums[end], nums[start]};
           else
               return new int[]{nums[start], nums[end]};

        }

        var subListA = mergeSort(nums, start, midPoint);
        var subListB = mergeSort(nums, midPoint+1, end);

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

        var arrayA = new int[]{5, 4, 3,2,1};

        var result = new MergeSort().mergeSort(arrayA, 0, arrayA.length-1);

        for(int i: result){
            System.out.println(i);
        }
    }
}
