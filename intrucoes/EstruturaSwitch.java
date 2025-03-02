package intrucoes;

public class EstruturaSwitch {
    public static void main(String[] args) {
        int diaDaSemana = 3;

        //4. Estrutura switch
        switch (diaDaSemana) {
         case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-feira");
            break;
        case 3:
            System.out.println("Terça-feira");
            break;
        case 5:
            System.out.println("Quarta-feira");
            break;
        case 6:
            System.out.println("Quinta-feira");
            break;
        case 7:
            System.out.println("Sexta-feira");
            break;
        case 8:
            System.out.println("Sábado");
        default:
            System.out.println("Dia inválido, tente novamente");
            break;


        }
    }
}
