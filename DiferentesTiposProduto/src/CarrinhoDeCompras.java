import java.util.HashMap;
import java.util.Map;

public class CarrinhoDeCompras {

    protected double valorTotal;
    protected int numeroItens = 0;

    HashMap<Produto, Integer> carrinho = new HashMap<>();

    void adicionaProduto(Produto p, int quantidade) {
       if(carrinho.containsKey(p)){
           carrinho.put(p, carrinho.get(p).intValue() + quantidade);
           numeroItens += carrinho.get(p).intValue();
       }
       else {
           carrinho.put(p, quantidade);
           numeroItens += quantidade;
       }
    }

    void removeProduto(Produto p, int quantidade) {
        if(carrinho.containsKey(p)){
            carrinho.remove(p,(carrinho.get(p).intValue()-quantidade));
            numeroItens -= quantidade;
        }
        else
            System.out.println("product not found");
    }

    public double calculaValor() {
        for (Map.Entry<Produto, Integer> entry : carrinho.entrySet()) {
           valorTotal += (entry.getKey().preco)*entry.getValue();
        }
        return valorTotal;
    }

}
