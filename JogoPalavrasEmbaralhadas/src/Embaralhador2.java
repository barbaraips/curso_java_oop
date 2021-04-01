import java.util.stream.IntStream;

public class Embaralhador2 implements Embaralhador {

    @Override
    public String embaralhador(String palavra) {

        char[] letras = palavra.toCharArray();

        IntStream.range(0, letras.length).filter(i -> i < letras.length - 1 && i % 2 == 0).forEach(i -> {
            char c = letras[i];
            letras[i] = letras[i + 1];
            letras[i + 1] = c;
        });

        return new String(letras);
    }
}
