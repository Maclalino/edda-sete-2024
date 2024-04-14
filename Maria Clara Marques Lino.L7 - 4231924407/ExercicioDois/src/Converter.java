import java.util.Stack;

public class Converter {

    private final int number;

    public Converter(int number) {
        this.number = number;
    }

    public String toBinary() {
        Stack<Integer> stack = new Stack<>();
        
        int temp = number;
        while (temp > 0) {
            stack.push(temp % 2);
            temp /= 2;
        }

        return stackToString(stack);
    }

    public String toOctal() {
        Stack<Integer> stack = new Stack<>();
        
        int temp = number;
        while (temp > 0) {
            stack.push(temp % 8);
            temp /= 8;
        }

        return stackToString(stack);
    }

    public String toHexadecimal() {
        Stack<Character> stack = new Stack<>();
        
        int temp = number;
        while (temp > 0) {
            int remainder = temp % 16;
            if (remainder < 10) {
                stack.push((char) ('0' + remainder));
            } else {
                stack.push((char) ('A' + remainder - 10));
            }
            temp /= 16;
        }

        return stackToString(stack);
    }

    private <T> String stackToString(Stack<T> stack) {
        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }
}
