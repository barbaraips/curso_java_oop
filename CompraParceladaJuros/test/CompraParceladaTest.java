import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompraParceladaTest {

    //Teste compra á vista
    @Test
    public void retornaTotalaVista() {
        Compra c = new Compra(135.99);
        assertEquals(135.99, c.retornaTotal());
    }

    //Testes compra parcelada
    @Test
    public void retornaTotal2X() {
        Compra c = new CompraParcelada(135.99,2,0.05f);
        assertEquals(136.13, c.retornaTotal());
    }

    @Test
    public void retornaTota5X() {
        Compra c = new CompraParcelada(135.99,5,0.07f);
        assertEquals(136.47, c.retornaTotal());
    }

    @Test
    public void retornaTotal10X() {
        Compra c = new CompraParcelada(135.99,10,0.09f);
        assertEquals(137.22, c.retornaTotal());
    }


}