package src;

public class Vetores {
    public static void main(String[] args) {
        // Declaração e inicialização do vetor com as notas dos alunos
        int[] notas = {85, 90, 78, 92, 88};

        // Variável para armazenar a soma das notas
        int soma = 0;

        // Percorre o vetor para calcular a soma das notas
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        // Calcula a média das notas
        double media = (double) soma / notas.length;

        // Exibe a média
        System.out.println("A média das notas é: " + media);
    }
}
