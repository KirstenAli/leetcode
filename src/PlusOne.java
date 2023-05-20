// worst case time n+n = 2n
public class PlusOne {

    // time = n
    public int[] plusOne(int[] digits) {
        var length = digits.length-1;

        for(int i=length; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                break;
            }

            else if(digits[i]==9 && i==0){
                digits[i]=0;
                return getPlusOneArray(digits);
            }

            else {
                digits[i]=0;
            }
        }

        return digits;
    }

    // time = n
    public int[] getPlusOneArray(int[] digits){
        var nums = new int[digits.length+1];

        nums[0]=1;

        for (int i=0; i<digits.length; i++){
            nums[i+1] =digits[i];
        }

        return nums;
    }
}
