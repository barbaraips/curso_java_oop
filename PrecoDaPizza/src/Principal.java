public class Principal {

    public static void main(String[] args){

        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();

        p1.adicionaIngrediente("calabresa");
        p1.adicionaIngrediente("tomate");

        p2.adicionaIngrediente("cebola");
        p2.adicionaIngrediente("presunto");
        p2.adicionaIngrediente("mussarela");


        CarrinhoDeCompras.addPizza(p1);
        CarrinhoDeCompras.addPizza(p2);
        CarrinhoDeCompras.addPizza(p3);

        System.out.println("O total do pedido e de " + CarrinhoDeCompras.retornaPreco() + " reais.");


        System.out.println("Ingredientes utilizados: ");
        for (String key : Pizza.hm.keySet()) {
            System.out.println(key + ": " + Pizza.hm.get(key));
        }


    }
}
