import java.util.Random;

class FabricaMecanicaDoJogo {

    static MecanicaDoJogo getMecanicaAleatoria() {
        Random random = new Random();
        if (random.nextInt(2) == 1)
            return new Mecanica1();
        return new Mecanica2();
    }
}
