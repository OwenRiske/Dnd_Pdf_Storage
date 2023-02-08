package com.company;

import java.awt.Desktop;
import java.io.File;

public class pdfStuff {

    //code from here: https://mkyong.com/java/how-to-open-a-pdf-file-in-java/
    public static void openPDF(String name) {
        try {

            File pdfFile = new File("c:\\"+name+".pdf");
            if (pdfFile.exists()) {

                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(pdfFile);
                } else {
                    System.out.println("Awt Desktop is not supported!");
                }

            } else {
                System.out.println(name+" is not exists!");
            }

            System.out.println("Done");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
