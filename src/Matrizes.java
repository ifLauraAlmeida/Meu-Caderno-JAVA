package src;

public class Matrizes {
    public static void main(String[] args) {
        // Declaração e inicialização da matriz com os valores de vendas
        double[][] vendas = {
            {1500.0, 2000.0, 2500.0}, // Vendas na Região 1
            {1800.0, 2200.0, 2700.0}, // Vendas na Região 2
            {1700.0, 2100.0, 2600.0}  // Vendas na Região 3
        };

        // Variável para armazenar o total de vendas
        double totalVendas = 0.0;

        // Percorre a matriz para calcular o total de vendas
        for (int i = 0; i < vendas.length; i++) {
            for (int j = 0; j < vendas[i].length; j++) {
                totalVendas += vendas[i][j];
            }
        }

        // Exibe o total de vendas
        System.out.println("O total de vendas é: " + totalVendas);
    }
}
