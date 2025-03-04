package MecanismosDeBusca;

public class BuscaSequencial {
    public static int buscaSequencial(int[] arr, int valor) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valor) {
                return i; // Retorna o índice do valor encontrado
            }
        }
        return -1; // Retorna -1 caso o valor não esteja presente
    }
    
}
