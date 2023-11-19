package academy.devdojo.maratonajava.ioexceptionarquivos.file;

import java.io.File;
import java.io.IOException;

// File para diretórios
public class File03 {
    public static void main(String[] args) throws IOException {
        File fileDiretorio = new File("arquivos");
        fileDiretorio.mkdir(); //cria o diretório
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo1.txt");
        fileArquivoDiretorio.createNewFile();

        //Renomear o diretório
        File diretorioRenamed = new File("arquivos2");
        fileDiretorio.renameTo(diretorioRenamed);

    }
}
