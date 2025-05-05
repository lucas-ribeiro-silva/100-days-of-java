import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        System.out.print("Escolha a operação (+ - * /): ");
        char op = sc.next().charAt(0);
        
        double resultado;
        switch(op) {
            case '+': resultado = num1 + num2; break;
            case '-': resultado = num1 - num2; break;
            case '*': resultado = num1 * num2; break;
            case '/': resultado = num2 != 0 ? num1 / num2 : 0; break;
            default: resultado = 0; System.out.println("Operação inválida");
        }
        System.out.println("Resultado: " + resultado);
    }
}