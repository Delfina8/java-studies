package academy.devdojo.maratonajava.ioexceptionarquivos.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("fileTest3.txt");

        try (FileWriter fw = new FileWriter(file)) {

            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("Teste de escrita Teste 2 escrita");
            bw.newLine(); //faz a quebra de linha, substitui o \n
            bw.write("Segunda linha");
            bw.flush();

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
