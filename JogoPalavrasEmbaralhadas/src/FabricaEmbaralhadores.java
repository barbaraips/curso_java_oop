import java.util.Random;

class FabricaEmbaralhadores {

    static Embaralhador getEmbaralhadorAleatorio() {
        Random random = new Random();
        if (random.nextInt(2) == 1)
            return new Embaralhador1();
        return new Embaralhador2();
    }
}