import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoDeComprasTest {


    static Produto p1;
    static Produto p2;
    static CarrinhoDeCompras c;

    @BeforeEach
    void criaProdutos() {
        p1 = new Produto("bolsa", 10);
        p2 = new ProdutoComTamanho("sapato", 20, "38");
        c = new CarrinhoDeCompras();

        c.adicionaProduto(p1, 2);
    }

    @Test
    void adicionaProduto() {
        c.adicionaProduto(p2, 1);
        assertEquals(3, c.numeroItens);
    }

    @Test
    void removeProduto() {
        c.removeProduto(p1,1);
        assertEquals(1, c.numeroItens);
    }

    @Test
    void calculaValor() {
        assertEquals(20, c.calculaValor());
    }
}