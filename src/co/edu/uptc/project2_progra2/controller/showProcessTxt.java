package co.edu.uptc.project2_progra2.controller;

import co.edu.uptc.project2_progra2.services.processTxt;

public class showProcessTxt {
    public void showTxt () {
        processTxt processTxt = new processTxt();
        try {
            processTxt.setPathName("\\C:\\Users\\FAMILIA CRUZ\\OneDrive\\Documentos\\progra2\\imgbase64.jpg");
            processTxt.deCodeBase64Img();
        } catch (Exception e) {
            System.out.println("Hubo un error");
        }
    }
}
