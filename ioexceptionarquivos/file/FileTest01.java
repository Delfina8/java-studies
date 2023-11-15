package academy.devdojo.maratonajava.ioexceptionarquivos.file;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("fileTest.txt");

        try {
            boolean isCreated = file.createNewFile();
            System.out.println("Created/Criado "+isCreated);
            System.out.println("path/caminho "+file.getPath());
            System.out.println("absolute path/caminho absoluto "+file.getAbsolutePath());
            System.out.println("is directory/é um diretório "+file.isDirectory());
            System.out.println("is file/é um arquivo "+file.isFile());
            System.out.println("is hidden/ está oculto "+file.isHidden());
            System.out.println("last modified/última modificação "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));

            boolean exists = file.exists();
            if(exists) {
                System.out.println("Deleted/Apagado "+ file.delete());
            }


        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
