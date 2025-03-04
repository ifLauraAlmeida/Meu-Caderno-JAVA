package MecanismosDeBusca;

public class BuscaSequencialExemplo {
    public static int buscaSequencial(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i; // Retorna a posição do número encontrado
            }
        }
        return -1; // Retorna -1 se o número não estiver na lista
    }
    public static void main(String[] args) {
        int[] numeros = {3, 7, 2, 9, 5}; // Nossa lista de números
        int procurado = 9; // Número que queremos encontrar

        int indice = buscaSequencial(numeros, procurado);

        if (indice != -1) {
            System.out.println("Número " + procurado + " encontrado na posição: " + indice);
        } else {
            System.out.println("Número " + procurado + " não encontrado na lista.");
        }
    }

   
}
