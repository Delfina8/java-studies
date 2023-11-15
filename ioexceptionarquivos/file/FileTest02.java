package academy.devdojo.maratonajava.ioexceptionarquivos.file;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File file2 = new File("file2.txt");

        try{
            file2.createNewFile();

            if(file2.exists()){
                file2.delete();
            }

        } catch(IOException e){
            e.printStackTrace();
        }
    }



}
