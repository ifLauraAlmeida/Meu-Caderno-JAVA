package intrucoes;

public class InstrucoesControle {
    public static void main(String[] args) {
        System.out.println("BREAK");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // ENCERRA O LOOP QUANDO i É IGUAL A 5
            }
            System.out.println("Iteração: " + i);
        }
    System.out.println("\nCONTINUE");
    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
            continue; // PULA A ITERAÇÃO PARA NÚMERO PARES
        }
        System.out.println("Iteração ímpar: " + i );
    }
    }
}
