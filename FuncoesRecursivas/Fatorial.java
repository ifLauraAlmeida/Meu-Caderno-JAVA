package FuncoesRecursivas;

public class Fatorial {
    public static int fatorial(int n) {
        if (n == 1) { // Caso base 🛑
            return 1;
        }

        return n * fatorial(n - 1); // Chamada recursiva 🔄
    }

    public static void main(String[] args) {
        System.out.println(fatorial(5)); // 120
    }
}