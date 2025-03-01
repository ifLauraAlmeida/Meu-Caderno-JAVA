package src;

public class OperadoresLogicosAND_OR_NOT {
    public static void main (String[] args){
        boolean a = true;
        boolean b = false;

        //Operador && (AND LÓGICO)
    System.out.println("a && b: " + (a && b));  //false, por que B é FALSO

        //Operador || (OR LÓGICO)
    System.out.println("a || b: " + (a || b )); // true, por que A é TRUE

        //Operador ! (NOT LÓGICO)
    System.out.println("!a: " + (!a)); // false, por que A é TRUE
    System.out.println("!b: " + (!b)); // true, por que A é FALSE
    }

}
