# CalculadoraIMC

Practical excercise from Week 1 of the course "Orientação a Objetos com Java". Calculates the body mass index of 3 patients based on their defined hight and weight, and displays the diagnosis for each one on the screen.

## Testes

Crie os testes de unidade para a classe que voce criou anteriormente para o cálculo do IMC. Crie pelo menos um teste para cada cenário abaixo, verificando o valor do IMC e o resultado obtido do método diagnostico():

    Baixo peso muito grave = IMC abaixo de 16 kg/m²
    Baixo peso grave = IMC entre 16 e 16,99 kg/m²
    Baixo peso = IMC entre 17 e 18,49 kg/m²
    Peso normal = IMC entre 18,50 e 24,99 kg/m²
    Sobrepeso = IMC entre 25 e 29,99 kg/m²
    Obesidade grau I = IMC entre 30 e 34,99 kg/m²
    Obesidade grau II = IMC entre 35 e 39,99 kg/m²
    Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²

### Review criteria

AssertEquals para valores de ponto flutuante

O método assertEquals() para valores de pontos flutuantes tem a seguinte assinatura: 
`assertEquals(double expected, double actual, double epsilon)`

O parâmetro adicional se refere a uma tolerância de diferença em relação ao valor esperado. O assert retornará verdadeiro enquanto a seguinte expressão for correta:

`Math.abs(expected - actual) < epsilon`

Esse parâmetro é necessário devido a possíveis arredondamentos que podem acontecer em operações com ponto flutuante!
