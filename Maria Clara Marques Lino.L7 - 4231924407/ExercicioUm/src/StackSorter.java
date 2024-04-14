import java.util.Stack;

public class StackSorter {

    private Stack<Integer> stack;

    public StackSorter() {
        this.stack = new Stack<>();
    }

    public void push(int num) {
        stack.push(num);
    }

    public void sortStack() {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            
            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(temp);
        }
        
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}