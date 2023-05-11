import java.util.HashMap;

// in this version we reduce the time complexity from n^2 to n
public class RomanToIntegerV2 {

    // time n
    public int romanToInt(String s) {
        var charMap = new HashMap<String, Integer>();
        charMap.put("I", 1);
        charMap.put("V", 5);
        charMap.put("X", 10);
        charMap.put("L", 50);
        charMap.put("C", 100);
        charMap.put("D", 500);
        charMap.put("M", 1000);

        var result =0;
        var pre =0;

        for(int i=s.length()-1; i>=0; i--){
            var currentCharAsString = String.valueOf(s.charAt(i));
            var currentCharAsInt = charMap.get(currentCharAsString);

            if(currentCharAsInt<pre)
                result -= currentCharAsInt;

            else result+= currentCharAsInt;

            pre = currentCharAsInt;

        }

        return result;
    }


}
