import java.util.Scanner;

public class DesafioCalculadora{

    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha uma operação:");
        System.out.println("[1]Soma");
        System.out.println("[2]Subtração");
        System.out.println("[3]Multiplicação");
        System.out.println("[4]Divisão");
        int operador = scanner.nextInt();
        
        System.out.println("Você selecionou a opção " + operador);
        
        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        scanner.close();
        double resultado;
        switch (operador){
            case 1:resultado = soma(num1,num2);
            break;
            case 2:resultado = subtracao(num1,num2);
            break;
            case 3:resultado = multiplicacao(num1,num2);
            break;
            case 4:resultado = divisao(num1,num2);
            break;
            default: resultado = 0;
        }
        System.out.println("O resultado é: " + resultado);
    }	
    public static double soma(double a, double b) {
        return a + b; 
    }    
    public static double subtracao(double a, double b) {
        return a - b; 
    }
    public static double multiplicacao(double a, double b) {
        return a * b; 
    }
    public static double divisao(double a, double b) {
        return a / b; 
    }
}
