package easy;

public class FirstOccurrenceInString {
    // time worst case, n-m(m), where n is the length of haystack and m is the length of needle
    public int strStr(String haystack, String needle) {

        var lengthDiff = haystack.length() - needle.length();

        for(int i=0; i<=lengthDiff; i++)
        {
            var count =i;

            for(int j=0; j<needle.length(); j++){

                if(needle.charAt(j) != haystack.charAt(count))
                    break;

                else if(j==needle.length()-1)
                    return i;

                count++;

            }
        }

        return -1;
    }

    public static void main(String [] args){
        var result = new FirstOccurrenceInString().strStr("leetcode", "leeto");

        System.out.println(result);
    }
}
