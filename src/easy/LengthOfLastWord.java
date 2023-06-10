package easy;

// runtime can be improved
public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        var words = s.split(" ");

        return words[words.length-1].length();
    }
}
