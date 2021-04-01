import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TesteCarroMult {

    CarroDeCorrida c;

    @BeforeEach
    public void inicializaCarro() {
        c = new CarroMult("teste2", 1.5, 100);
    }

    @Test
    public void testeAceleraUmaVez() {
        c.acelerar();
        assertEquals(10, c.getVelocidade());
    }

    @Test
    public void testeAceleraDuasVezes() {
        c.acelerar();
        c.acelerar();
        assertEquals(15, c.getVelocidade());
    }

    @Test
    public void testeFrear() {
        c.acelerar();
        c.frear();
        assertEquals(5, c.getVelocidade());
    }

    @Test
    public void testeFrearAteZero() {
        c.acelerar();
        c.frear();
        c.frear();
        c.frear();
        c.frear();
        assertEquals(0, c.getVelocidade());
    }

    @Test
    public void testeAcelerarAteMaximo() {

        for (int i = 0; i < 14; i++)
            c.acelerar();

        assertEquals(100, c.getVelocidade());
    }
}