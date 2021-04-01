import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoComTamanhoTest {

    ProdutoComTamanho p = new ProdutoComTamanho("blusa feminina", 22.90, "M");

    @Test
    void testeProduto() {
        assertEquals("blusa feminina", p.nome);
        assertEquals(22.90, p.preco);
        assertEquals("M", p.tamanho);
    }

}