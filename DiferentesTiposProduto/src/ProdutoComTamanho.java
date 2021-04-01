import java.util.Objects;

public class ProdutoComTamanho extends Produto {

    protected String tamanho;

    public ProdutoComTamanho(String nome, double preco, String tamanho) {
       super(nome, preco);
       this.tamanho = tamanho;
       this.codigo = this.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProdutoComTamanho that = (ProdutoComTamanho) o;
        return tamanho.equals(that.tamanho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tamanho);
    }
}

