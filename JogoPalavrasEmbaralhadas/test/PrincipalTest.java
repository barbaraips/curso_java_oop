import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PrincipalTest {

    private static Embaralhador embaralhador2;
    private static Embaralhador embaralhador1;

    @BeforeClass
    public static void inicializarEmbaralhador() {
        embaralhador1 = new Embaralhador1();
        embaralhador2 = new Embaralhador2();
    }

    @Test
    public void testeOrdemInversa() {
        Assertions.assertEquals("arvalap", embaralhador1.embaralhador("palavra"));
    }

    @Test
    public void testeTrocaLetras() {
        Assertions.assertEquals("apalrva", embaralhador2.embaralhador("palavra"));
    }

}
