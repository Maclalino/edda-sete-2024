import java.util.Stack;

public class PalindromeChecker{

    public static boolean isPalindrome(String word) {
        Stack<Character> stack = new Stack<>();
        
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            stack.push(word.charAt(i));
        }
        
        for (int i = length / 2 + (length % 2); i < length; i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        
        return true;
    }
}