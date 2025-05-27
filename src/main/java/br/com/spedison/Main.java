package br.com.spedison;

import br.com.spedison.app.GeradorDados;
import br.com.spedison.logger.ConfigLogger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.logging.Logger;

public class Main {

    static final Logger log = ConfigLogger.getLogger(Main.class);

    public static void main(String[] args) {

        Path dadosDir = Paths.get(".","dados");

        // Cria o diretório se não existir
        if (Files.notExists(dadosDir)) {
            try {
                Files.createDirectory(dadosDir);
            } catch (IOException e) {

                throw new RuntimeException(e);
            }
            System.out.println("Diretório 'dados' criado.");
        } else {
            log.info("Diretório dados já criado.");
        }

        GeradorDados.main(args);
    }
}
