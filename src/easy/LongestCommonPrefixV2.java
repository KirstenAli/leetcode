package easy;

import java.util.Arrays;

// time complexity log2(n)*n +n
public class LongestCommonPrefixV2 {

    // time logN + N
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs); // logn

        var firstWord = strs[0];
        var secondWord = strs[strs.length-1];

        var minLength = Math.min(firstWord.length(),
                secondWord.length());

        var prefix ="";

        if(firstWord.equals("") || secondWord.equals(""))
            return prefix;

        for (int i=0; i<minLength; i++){
            var firstChar = firstWord.charAt(i);

            if(firstChar != secondWord.charAt(i)) break;

            prefix+= firstChar;
        }

        return prefix;

    }

    public static void main(String[] args){
        var stringArray = new String [] {"flower","flow","flight"};

        var result = new LongestCommonPrefix().longestCommonPrefix(stringArray);

        System.out.println(result);
    }
}
