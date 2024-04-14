
import java.util.Scanner;
public class App {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Digite um número inteiro na base 10:");
            int number = scanner.nextInt();
    
            System.out.println("Escolha a conversão desejada:");
            System.out.println("a) Decimal para Binário");
            System.out.println("b) Decimal para Octal");
            System.out.println("c) Decimal para Hexadecimal");
    
            char option = scanner.next().charAt(0);
    
            Converter converter = new Converter(number);
    
            switch (option) {
                case 'a':
                    System.out.println("Binário: " + converter.toBinary());
                    break;
                case 'b':
                    System.out.println("Octal: " + converter.toOctal());
                    break;
                case 'c':
                    System.out.println("Hexadecimal: " + converter.toHexadecimal());
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
    
            scanner.close();
        }
    }
    

