package src;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int numero = -87;

        //1. Estrutura IF
        if (numero > 0) {
            System.out.println("O número é positivo.");
        }
        //2. Estrutura IF-ELSE
        if (numero % 2 == 0){
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar");
        }
        //3. Estrutura IF-ELSE IF-ELSE ANINHADO
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

    }

}    
