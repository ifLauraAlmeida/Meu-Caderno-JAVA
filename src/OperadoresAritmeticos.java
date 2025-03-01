package src;

public class OperadoresAritmeticos {
    public static void main (String[] args) {
       int x = 15;
       int y = 5;
       
       //soma
       int soma = x + y;
       System.out.println("soma: " + soma);


       //subtração
       int subtração = x - y;
       System.out.println("subtração: " + subtração);

       //multiplicação
       int multiplicação = x * y;
       System.out.println("multiplicação: " + multiplicação);

       //divisão
       int divisão = x / y;
       System.out.println("divisão: " + divisão);

       //exponencial
       //int exponencial = x ** y; //SOMENTE COM A BIBLIOTECA DO MATH 
       //System.out.println("exponencial: " + exponencial);

       int módulo = x % y; //Resto da divisão
       System.out.println("módulo: " + módulo);

       //Operadores de Incremento e Decremento
       int incremento = 10;
       int decremento = 10;

       incremento++; // incremento (incremento em 1)
       System.out.println("Valor após incremento: " +incremento);

       decremento--; // decremento (subtrai em -1)
       System.out.println("Valor após exponencial: " +decremento);

    }
}
