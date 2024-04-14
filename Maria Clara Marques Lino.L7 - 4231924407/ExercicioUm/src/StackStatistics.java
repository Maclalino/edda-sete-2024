import java.util.Stack;

public class StackStatistics {

    private Stack<Integer> stack;

    public StackStatistics() {
        this.stack = new Stack<>();
    }

    public void push(int num) {
        stack.push(num);
    }

    public void getStats() {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        
        while (!stack.isEmpty()) {
            int num = stack.pop();
            
            if (num > max) {
                max = num;
            }
            
            if (num < min) {
                min = num;
            }
            
            sum += num;
        }
        
        double average = (double) sum / (double) (max - min + 1);
        
        System.out.println("Maior valor: " + max);
        System.out.println("Menor valor: " + min);
        System.out.println("Média: " + average);
    }
}
