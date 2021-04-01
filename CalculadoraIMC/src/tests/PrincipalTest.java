import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;

class PrincipalTest {

    @Test
    public void valorIMCTest() {

        Paciente p1 = new Paciente();
        p1.peso = 70;
        p1.altura = 1.73;

        Assertions.assertEquals(23.3, Paciente.calcularIMC(p1.altura, p1.peso), 0.5);

    }

    @Test
    void groupedAssertions() {
        Paciente p1 = new Paciente();
        p1.peso = 40;
        p1.altura = 1.60;

        Paciente p2 = new Paciente();
        p2.peso = 54;
        p2.altura = 1.83;

        Paciente p3 = new Paciente();
        p3.peso = 55;
        p3.altura = 1.75;

        Paciente p4 = new Paciente();
        p4.peso = 65;
        p4.altura = 1.70;

        Paciente p5 = new Paciente();
        p5.peso = 90;
        p5.altura = 1.85;

        Paciente p6 = new Paciente();
        p6.peso = 80;
        p6.altura = 1.60;

        Paciente p7 = new Paciente();
        p7.peso = 95;
        p7.altura = 1.63;

        Paciente p8 = new Paciente();
        p8.peso = 120;
        p8.altura = 1.70;


        assertAll("IMC",
            () -> Assertions.assertEquals("O diagnostico do paciente é baixo peso muito grave.", Paciente.diagnostico(p1)),
            () -> Assertions.assertEquals("O diagnostico do paciente é baixo peso grave.", Paciente.diagnostico(p2)),
            () -> Assertions.assertEquals("O diagnostico do paciente é baixo peso.", Paciente.diagnostico(p3)),
            () -> Assertions.assertEquals("O diagnostico do paciente é peso normal.", Paciente.diagnostico(p4)),
            () -> Assertions.assertEquals("O diagnostico do paciente é sobrepeso.", Paciente.diagnostico(p5)),
            () -> Assertions.assertEquals("O diagnostico do paciente é obesidade grau I.", Paciente.diagnostico(p6)),
            () -> Assertions.assertEquals("O diagnostico do paciente é obesidade grau II.", Paciente.diagnostico(p7)),
            () -> Assertions.assertEquals("O diagnostico do paciente é obesidade grau III (obesidade mórbida).", Paciente.diagnostico(p8))
        );
    }

}