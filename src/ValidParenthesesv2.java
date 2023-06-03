import java.util.Stack;

/*
An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Every close bracket has a corresponding open bracket of the same type.

This approach uses a stack and so the space complexity is linear (size of s)
 */

public class ValidParenthesesv2 {
    public boolean isValid(String s) {
        Stack<Character> openStack = new Stack<>();
        Stack<Character> closeStack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            var symbol = s.charAt(i);

            if(symbol=='(' || symbol=='{' || symbol=='[')
                openStack.push(symbol);

            else closeStack.push(symbol);

        }

        if(openStack.size() !=closeStack.size())
            return false;

        for(int i=0; i<openStack.size(); i++){
            if(openStack.pop()!=closeStack.pop())
                return false;
        }

        return true;
    }

    public static void main(String[] args){
        var result = new ValidParentheses().isValid("([)]");
        System.out.println(result);
    }
}
