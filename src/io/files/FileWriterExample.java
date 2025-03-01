package src.io.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//ESCRITA
public class FileWriterExample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter( //TENTATIVA DE ESCREVER
            new FileWriter("arquivo.txt"))){
        writer.write("Olá, Mundo!");
        writer.newLine();
        writer.write("Segunda linha.");
            } catch (IOException e) { //ABRAÇA O ERRO CASO ELE ACONTEÇA
                e.printStackTrace();
            }
            }
        
    }

