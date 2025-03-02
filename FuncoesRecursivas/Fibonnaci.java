package FuncoesRecursivas;

public class Fibonnaci {

        public static int fibonacci(int n) {
            if (n == 0) return 0; // Caso base 🛑
            if (n == 1) return 1; // Caso base 🛑
    
            return fibonacci(n - 1) + fibonacci(n - 2); // Chamada recursiva 🔄
        }
    
        public static void main(String[] args) {
            System.out.println(fibonacci(5)); // 5
        }
    }
    