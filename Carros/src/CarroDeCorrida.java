public abstract class CarroDeCorrida {
    protected int velocidade;
    protected int velocidadeMaxima;
    protected String nome;

    public CarroDeCorrida(int velocidadeMaxima, String nome) {
        this.velocidade = 0;
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
    }

    public abstract void acelerar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void frear() {
        velocidade = velocidade / 2;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
