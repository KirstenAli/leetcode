public class LengthOfLastWordv2 {
    public int lengthOfLastWord(String s) {
        var wordsLength = s.length()-1;
        var letterFound = false;
        var count =0;

        for(int i=wordsLength; i>=0; i--){
            if(!letterFound) {
                if (s.charAt(i) != ' ') {
                    letterFound = true;
                    count++;
                }
            }
            
            else{
                if(s.charAt(i) ==' ')
                    break;
                else count++;
            }
        }

        return count;
    }
}
