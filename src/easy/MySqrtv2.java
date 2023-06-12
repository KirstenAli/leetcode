package easy;

public class MySqrtv2 {

    public int mySqrt(int x) {
        if(x<2){
            return x;
        }

        int start =1;
        int end = x;

        while(start<=end){

            int mid = (start+end)/2;

            if(mid == x/mid)
                return mid;

            else if(mid<x/mid){
                start = mid+1;
            }

            else{
                end = mid-1;
            }
        }

        return end;
    }

    public static void main(String[] args){
        var result = new MySqrtv2().mySqrt(5);
        System.out.println(result);
    }
}
