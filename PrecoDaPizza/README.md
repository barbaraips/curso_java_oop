# Qual e o Preço da Pizza?

Exercício final da segunda semana do curso `Orientação a Objetos com Java`

## Instruções

Crie uma classe Pizza que possua o método adicionaIngrediente() que recebe uma String com o ingrediente a ser adicionado. Essa classe também deve possuir o método getPreco() que calcula da seguinte forma: 2 ingredientes ou menos custam 15 reais, de 3 a 5 ingredientes custam 20 reais e mais de 5 ingredientes custa 23 reais.

É preciso contabilizar os ingredientes gastos por todas as pizzas! Utilize uma variável estática na classe Pizza para guardar esse tipo de informação (dica: utilize a classe HashMap para guardar o ingrediente como chave e um Integer como valor). Crie o método estático contabilizaIngrediente() para ser chamado dentro de adicionaIngrediente() e fazer esse registro.

Crie uma nova classe chamada CarrinhoDeCompras que pode receber objetos da classe Pizza. Ela deve ter um método que retorna o valor total de todas as pizzas adicionadas. O Carrinho não pode aceitar que seja adicionada uma pizza sem ingredientes.

Crie uma classe Principal com o método main() que faz o seguinte:

    Cria 3 pizzas com ingredientes diferentes
    Adiciona essas Pizzas em um CarrinhoDeCompra
    Imprime o total do CarrinhoDeCompra
    Imprime a quantidade utilizada de cada ingrediente

## Testes

Faça os testes de unidade da classe Pizza e verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes. Verifique também se o registro de ingredientes funcionou corretamente. Crie um método estático na classe Pizza que zera o registro de ingredientes e invoque ele em um método de inicialização ou finalização na classe de testes. Um método de teste deve ser independente do que aconteceu em outros métodos de teste!

Faça os testes da classe CarrinhoDeCompras, verificando se o preço das pizzas são somados corretamente e se ele impede a adição de uma pizza sem ingredientes.

Procure criar os testes de forma que cada método de testes verifique um cenário e uma funcionalidade. Evite por exemplo, em um mesmo teste, verificar o preço da pizza e o registro de ingredientes ao mesmo tempo.
