package FuncoesRecursivas;

public class ContagemRegressiva {
    public static void contagemRegressiva(int n) {
        if (n == 0) { // Caso base 🛑
            System.out.println("Fim!");
            return;
        }

        System.out.println(n);
        contagemRegressiva(n - 1); // Chamada recursiva 🔄
    }

    public static void main(String[] args) {
        contagemRegressiva(5);
    }
}