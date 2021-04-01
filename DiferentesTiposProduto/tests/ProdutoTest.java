import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoTest {

    Produto p = new Produto("sabonete", 3.99);

    @Test
    void testeProduto() {
        assertEquals("sabonete", p.nome);
        assertEquals(3.99, p.preco);
    }


}