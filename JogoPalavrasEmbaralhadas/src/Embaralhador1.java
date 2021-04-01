import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Embaralhador1 implements Embaralhador {

    @Override
    public String embaralhador(String palavra) {

        char[] letras = palavra.toCharArray();

        return IntStream.iterate(letras.length - 1, i -> i >= 0, i -> i - 1)
            .mapToObj(i -> String.valueOf(letras[i])).collect(Collectors.joining());
    }
}
