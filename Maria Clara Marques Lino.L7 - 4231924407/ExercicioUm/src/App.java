
public class App {

    public static void main(String[] args) {
        // a) Invertendo as letras de cada palavra em um texto
        String text = "ESTE EXERCÍCIO É MUITO FÁCIL.";
        String invertedText = TextProcessor.invertWords(text);
        System.out.println("Texto invertido: " + invertedText);

        // b) Verificando se uma palavra é um palíndromo
        String word = "RADAR";
        boolean isPalindrome = PalindromeChecker.isPalindrome(word);
        System.out.println("É palíndromo? " + isPalindrome);

        // c) Ordenando valores em uma pilha
        StackSorter stackSorter = new StackSorter();
        stackSorter.push(3);
        stackSorter.push(1);
        stackSorter.push(4);
        stackSorter.push(2);
        stackSorter.sortStack();
        System.out.println("Pilha ordenada: " + stackSorter);

        // d) Maior, menor e média dos elementos da pilha
        StackStatistics stackStats = new StackStatistics();
        stackStats.push(3);
        stackStats.push(1);
        stackStats.push(4);
        stackStats.push(2);
        stackStats.getStats();
    }
}
