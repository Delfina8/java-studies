package academy.devdojo.maratonajava.ioexceptionarquivos.file;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("fileTest3.txt");

        try (FileReader fw = new FileReader(file);
             BufferedReader br = new BufferedReader(fw)){
                String linha;
                while((linha = br.readLine()) != null){
                    System.out.println(linha);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
