import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

class BancoDePalavras {

    private List<String> listaDePalavras;

    BancoDePalavras() throws IOException {
        this.listaDePalavras = Files.readAllLines(Paths.get("/home/barbara/Curso Java/JogoPalavrasEmbaralhadas/resources/palavras"));
    }

    String getPalavra() {
        if (this.listaDePalavras.size() > 0)
            return getPalavraAleatoria(this.listaDePalavras);
        else
            return null;
    }

    private String getPalavraAleatoria(List<String> lista) {
        int randomIndex = new Random().nextInt(lista.size());
        String palavraAtual = lista.get(randomIndex);
        lista.remove(randomIndex);
        return palavraAtual;
    }
}
