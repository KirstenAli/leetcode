package easy;

public class ReverseArray {

    public static int[] reverse(int[]a){
        var length = a.length;
        var reversed = new int[length];

        for(int i=0; i<length; i++){
            reversed[length-i-1] = a[i];
        }

        return reversed;
    }

    public static void printReverseArray(int[]a){

        for(int i = a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args){
        var intArray = new int[]{1, 3, 5, 6, 8, 10, 20};

        var result =  ReverseArray.reverse(intArray);

        for(int i : result){
            System.out.println(i);
        }

        printReverseArray(intArray);
    }
}
