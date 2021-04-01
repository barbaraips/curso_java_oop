import java.util.Objects;

public class Produto extends  Object {

    protected String nome;
    protected int codigo;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.codigo = this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo &&
            Double.compare(produto.preco, preco) == 0 &&
            nome.equals(produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco);
    }
}
