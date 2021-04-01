public class CarroSoma extends CarroDeCorrida {

    private int potencia;

    public CarroSoma(String nome, int potencia, int velocidadeMaxima) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    @Override
    public void acelerar() {
        if (velocidade < velocidadeMaxima) {
            velocidade += potencia;
        }
    }

}
