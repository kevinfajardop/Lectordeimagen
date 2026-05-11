package com.mycompany.lectordeimagen;

import net.sourceforge.tess4j.Tesseract;
import java.io.File;
import java.io.FileWriter;

public class Lectordeimagen {

    public static void main(String[] args) {

        try {
            Tesseract tesseract = new Tesseract();

            // Ruta donde está spa.traineddata
            tesseract.setDatapath("C:\\Users\\kevin\\Downloads");
            tesseract.setLanguage("spa");

            // ✅ Ruta COMPLETA de la imagen (archivo, no carpeta)
            File imagen = new File("C:/Users/kevin/OneDrive/Imágenes/imagenPrueba.png");

            String texto = tesseract.doOCR(imagen);

            System.out.println("Texto detectado:\n" + texto);

            FileWriter writer = new FileWriter("resultado.txt");
            writer.write(texto);
            writer.close();

            System.out.println("Texto guardado en resultado.txt");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}