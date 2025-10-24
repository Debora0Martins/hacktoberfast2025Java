import java.util.InputMismatchException;
import java.util.Scanner;

public class InteractiveCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Calculadora Interativa ===");

        try {
            System.out.print("Digite o primeiro número: ");
            double a = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = scanner.nextDouble();

            System.out.print("Escolha a operação (+, -, *, /): ");
            char op = scanner.next().charAt(0);

            double result;
            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/':
                    if (b == 0) {
                        System.out.println("Erro: divisão por zero.");
                        scanner.close();
                        return;
                    } else {
                        result = a / b;
                    }
                    break;
                default:
                    System.out.println("Operação inválida.");
                    scanner.close();
                    return;
            }

            System.out.println("Resultado: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Use números (ex.: 1.23).");
        } finally {
            scanner.close();
        }
    }
}