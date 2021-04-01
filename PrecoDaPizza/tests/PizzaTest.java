import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class PizzaTest {

    @Test
    void adicionaIngrediente() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("pepperoni");
        p.adicionaIngrediente("mussarela");
        assertEquals(2, p.listaIngredientes.size());

    }

    @Test
    void getPreco() {
        Pizza p = new Pizza();
        p.adicionaIngrediente("pepperoni");
        p.adicionaIngrediente("mussarela");
        p.adicionaIngrediente("tomates");
        assertEquals(20, p.getPreco());

    }


}