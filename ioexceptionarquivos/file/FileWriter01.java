package academy.devdojo.maratonajava.ioexceptionarquivos.file;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("fileTest2.txt");

        try (FileWriter fw = new FileWriter(file)) {

            fw.write("Teste de escrita \nTeste 2 escrita");

            fw.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
