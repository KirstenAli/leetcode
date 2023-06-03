/*
An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order. ?????
3. Every close bracket has a corresponding open bracket of the same type.

Every close bracket has a corresponding open bracket of the same type.

 */

// time and space = linear

import java.util.Stack;

public class ValidParenthesesv2 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            var symbol = s.charAt(i);

            if(symbol=='(')
                stack.push(')');

            else if(symbol =='{')
                stack.push('}');

            else if(symbol =='[')
                stack.push(']');

            else{
                if(stack.empty())
                    return false;
                else {
                    var top = stack.pop();

                    if(top !=symbol)
                        return false;
                }
            }

        }

        return stack.empty();

    }

    public static void main(String[] args){
        var result = new ValidParentheses().isValid("((({})))");
        System.out.println(result);
    }
}
