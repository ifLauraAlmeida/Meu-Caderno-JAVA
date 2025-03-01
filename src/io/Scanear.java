package src.io;
import java.util.Scanner;

public class Scanear {
    public static void main (String[] args) {
     
    // Cria o scanner para ler dados
        Scanner scanner = new Scanner(System.in);

    // Solicita a entrada do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

    // Exibe a saída
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");

    // Fecha o scanner após o uso
        scanner.close();
    }
}

