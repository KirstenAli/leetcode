public class MergeSortedArrays {
    public static int[] merge(int[] a, int[]b){
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
}
