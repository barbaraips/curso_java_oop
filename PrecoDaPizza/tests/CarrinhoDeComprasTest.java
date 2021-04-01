import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoDeComprasTest {

    private static Pizza p1 = new Pizza();
    private static Pizza p2 = new Pizza();
    private static Pizza p3 = new Pizza();

    @Test
    @BeforeAll
    static void setup() {

        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("mussarela");

        p2.adicionaIngrediente("tomates");
        p2.adicionaIngrediente("manjericão");
        p2.adicionaIngrediente("mussarela");

        CarrinhoDeCompras.addPizza(p1);
        CarrinhoDeCompras.addPizza(p2);
        CarrinhoDeCompras.addPizza(p3);
    }

    @Test
    @AfterAll
    static void limpaListaTest() {
        p1.zeraListaIngredientes(p1.listaIngredientes);
        assertEquals(0, p1.listaIngredientes.size());
    }

    @Test
    void contaPizzaTest() {
        assertEquals(2, CarrinhoDeCompras.numeroPizzas);
    }

    @Test
    void retornaPrecoTest() {
        assertEquals(35, CarrinhoDeCompras.retornaPreco());
    }
}