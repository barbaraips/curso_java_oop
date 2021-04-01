import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AutoridadeTest {

    private Autoridade pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Autoridade("Bárbara", "Perdigão");
    }

    @Test
    void testeNomeInformal() {
        pessoa.setFormatadorInformal();
        Assertions.assertEquals("Bárbara", pessoa.getTratamento());
    }

    @Test
    void testeNomeRespeitoso() {
        pessoa.setFormatadorRespeitoso("feminino");
        Assertions.assertEquals("Sra. Bárbara Perdigão", pessoa.getTratamento());
    }

    @Test
    void testeNomeTitulo() {
        pessoa.setFormatadorTitulo("Magnífica");
        Assertions.assertEquals("Magnífica Bárbara Perdigão", pessoa.getTratamento());
    }

}