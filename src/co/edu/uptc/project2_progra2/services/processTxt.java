package co.edu.uptc.project2_progra2.services;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Base64;

import javax.imageio.ImageIO;

public class processTxt {
    private String path = "";
    public void setPathName (String path) {
        this.path = path;
    }
    public String readFile() throws IOException {
        File doc = new File(path);
        BufferedReader obj = new BufferedReader(new FileReader(doc));
        String txt = "";
        String strng;
        while ((strng = obj.readLine()) != null) {
            txt += strng;
        }
        obj.close();
        return txt;
    }

    public String deCodeBase64Txt() throws Exception {
        String base64 = readFile();
        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        String decodedString = new String(decodedBytes);
        return decodedString;
    }

    public void deCodeBase64Img () throws IOException {
        File outputFile = new File("C:\\Users\\FAMILIA CRUZ\\OneDrive\\Documentos\\progra2\\image.jpg");
        String base64 = readFile();
        byte[] bytesDecode = Base64.getDecoder().decode(base64);
        BufferedImage image = javax.imageio.ImageIO.read(new java.io.ByteArrayInputStream(bytesDecode));
        ImageIO.write(image, "jpg", outputFile);
    }
}
