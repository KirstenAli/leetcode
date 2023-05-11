public class LongestCommonPrefix {

    // time, c+Ln, where l is the length of the longest string, and c is the number of chars
    public String longestCommonPrefix(String[] strs) {
        var rows = strs.length;
        var columns = longestString(strs);
        var charMatrix = StringsToCharMatrix(strs, columns);
        var prefix ="";

        if(rows==1)
            return strs[0];

        for(int i=0; i<columns; i++){
            var currentChar = charMatrix[0][i];

            if(!elementsSame(charMatrix, rows, i)) break;

            prefix += currentChar;
        }

        return prefix;
    }

    // time c, where c is the total num of chars
    public char[][] StringsToCharMatrix(String[] strings, int columns){
        var rows = strings.length;
        var charMatrix = new char[rows][columns];

        for(int i=0; i<rows; i++){
            for (int j=0; j<strings[i].length(); j++){
                charMatrix[i][j] = strings[i].charAt(j);
            }
        }

        return charMatrix;
    }

    // time = n, number of elements in string array (rows)
    public boolean elementsSame(char [][] chars, int rowCount, int column){
        var charToCompare = chars[0][column];

        for(int i=1; i<rowCount; i++){
            if(chars[i][column]!=charToCompare)
                return false;
        }

        return true;
    }

    // time = n
    public int longestString(String [] strings){
        var longest =0;

        for (int i=0; i<strings.length; i++){
            var length = strings[i].length();

            if(length > longest)
                longest = length;
        }

        return longest;
    }

    public static void main(String[] args){
        var stringArray = new String [] {"flower","flow","flight"};

        var result = new LongestCommonPrefix().longestCommonPrefix(stringArray);

        System.out.println(result);
    }
}
