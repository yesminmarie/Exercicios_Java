import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Arquivo {
    private static void criarArquivo() throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("Have You Ever Seen The Rain");
        sb.append(System.getProperty("line.separator"));
        sb.append("Paradise");
        sb.append(System.getProperty("line.separator"));
        sb.append("Daydream Believer");

        Path p = Paths.get("musicas.txt");
        Files.write(p, sb.toString().getBytes());
    }

    private static void lerArquivo() throws IOException {
        Path arquivo = Paths.get("musicas.txt");
        Stream<String> linhas = Files.lines(arquivo);
        linhas.forEach(System.out::println);
    }
    public static void main(String[] args) {
        try {
            criarArquivo();
            lerArquivo();
        }catch (IOException e){
            System.out.println("Exception: " + e.getMessage());
        }

    }
}
