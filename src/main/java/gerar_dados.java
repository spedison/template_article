import java.io.FileWriter;
import java.io.PrintWriter;

public class gerar_dados {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("dados.csv"))) {
            writer.println("Tempo,Valor");
            for (int t = 0; t <= 10; t++) {
                writer.printf("%d,%.4f%n", t, Math.sin(t));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

