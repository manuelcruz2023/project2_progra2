package co.edu.uptc.project2_progra2.controller;
import java.io.IOException;

import co.edu.uptc.project2_progra2.services.processTxt;
public class showProcessTxt {
    public void showTxt () {
        processTxt processTxt = new processTxt();
        try {
            System.out.println(processTxt.readFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
