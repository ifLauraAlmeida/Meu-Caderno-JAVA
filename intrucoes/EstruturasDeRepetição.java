package intrucoes;

public class EstruturasDeRepetição {
    public static void main(String[] args)  {
        //1. Estrutura FOR
        System.out.println("Estrutura for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }
System.out.println("CONTINUANDO...");

        //2. Estrutura WHILE
        System.out.println("\nEstrutura while: ");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }
System.out.println("CONTINUANDO...");

        //3. Estrutura DO-WHILE
        System.out.println("\nEstrutura DO-WHILE");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);
        
    }
}