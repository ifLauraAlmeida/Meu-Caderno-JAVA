package FuncoesRecursivas;

public class RecursaoInfinita {
        public static void infinito(int n) {
            System.out.println(n);
            infinito(n + 1); // Nunca para! 🚨
        }
    
        public static void main(String[] args) {
            infinito(1);
        }
    }
    