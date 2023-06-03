/*
An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Every close bracket has a corresponding open bracket of the same type.

Every close bracket has a corresponding open bracket of the same type.

 */
// time = linear, space = constant

public class ValidParentheses {
    public boolean isValid(String s) {
        var openBracketFound = false;
        var openCurlyFound = false;
        var openSquareFound = false;

        var openBracketClose = false;
        var openCurlyClose = false;
        var openSquareClose = false;

        var openBracketCount = 0;
        var openCurlyCount = 0;
        var openSquareCount = 0;

        for (int i=0; i<s.length();i++)
        {
            if(s.charAt(i)== '('){
                openBracketCount++;
                openBracketFound = true;
            }

            else if(s.charAt(i)== '{'){
                openCurlyCount++;
                openCurlyFound = true;
            }

            else if(s.charAt(i)=='['){
                openSquareCount++;
                openSquareFound = true;
            }

            else if(s.charAt(i)== ')'){
                openBracketCount--;
                if(openBracketCount==0)
                    openBracketClose=true;
            }

            else if(s.charAt(i)== '}'){
                openCurlyCount--;
                if(openCurlyCount==0)
                    openCurlyClose=true;
            }

            else if(s.charAt(i)==']'){
                openSquareCount--;
                if(openSquareCount==0)
                    openSquareClose=true;
            }

        }

        return openBracketFound == openBracketClose &&
                openCurlyFound == openCurlyClose &&
                openSquareFound == openSquareClose;
    }


    public static void main(String[] args){
        var result = new ValidParentheses().isValid("(]");
        System.out.println(result);
    }
}
