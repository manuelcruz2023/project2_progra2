package co.edu.uptc.project2_progra2.services;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class processTxt {
    public String path = "C:\\Users\\FAMILIA CRUZ\\OneDrive\\Documentos\\progra2\\archivobase64.txt";

    public boolean existFile () {
        File file = new File(path);
        return file.exists();
    }

    public String readFile () throws IOException {
        String texto = "";
        File file = new File(path);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        while ((texto = br.readLine()) != null) {
            System.out.println(texto);
        }
        fr.close();
        return texto;
    }
}
