package br.com.spedison.app;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Random;
//import

public class GeradorDados {
    public static void main(String[] args) {
        Double amplitudeRuido = Double.parseDouble(args[1]);
        Random rand = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(args[0]))) {
            writer.println("Tempo,Valor,ValorRuido");
            for (int t = 0; t <= 100; t++) {
                Double r = rand.nextDouble() * amplitudeRuido;
                writer.printf(Locale.US,"%.4f,%.4f,%.4f%n", t/10., Math.sin(t/10.), Math.sin(t/10.) + amplitudeRuido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

