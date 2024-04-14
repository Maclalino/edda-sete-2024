import java.util.Stack;
public class TextProcessor {
    public static String invertWords(String text) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (char c : text.toCharArray()) {
            if (c != ' ' && c != '.') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
                result.append(c);
            }
        }
        
        return result.toString();
    }
}

