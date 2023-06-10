package easy;

public class PalindromeNumber {

    //time n/2, where n is the number of digits in the number
    public boolean isPalindrome(int x) {
        var num = Integer.valueOf(x);
        var intAsString = num.toString();
        var numLength = intAsString.length();
        var mid = numLength/2;

        for(int i=0; i<mid; i++){
            if(intAsString.charAt(i) != intAsString.charAt(numLength-i-1))
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        var result = new PalindromeNumber().isPalindrome(10);

        System.out.println(result);
    }
}
