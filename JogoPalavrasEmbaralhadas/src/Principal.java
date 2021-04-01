import java.io.IOException;
import java.util.Scanner;

class Principal {

    public static void main(String[] args) throws IOException {

        System.out.println("\n*** Jogo das Palavras Embaralhadas *** \n");
        Scanner scan = new Scanner(System.in);
        MecanicaDoJogo mecanica = FabricaMecanicaDoJogo.getMecanicaAleatoria();
        BancoDePalavras bancoDePalavras = new BancoDePalavras();

        while (!mecanica.fimDeJogo()) {
            String palavra = bancoDePalavras.getPalavra();
            if (palavra != null) {
                String palavraEmbaralhada = mecanica.getPalavraEmbaralhada(palavra);
                System.out.printf("A palavra embaralhada é: '%s'%n", palavraEmbaralhada);
                System.out.print("Digite seu palpite: ");

                if (mecanica.respostaCerta(palavra, scan.nextLine())) {
                    System.out.println("Parabéns, você acertou!");
                } else {
                    while (mecanica.tentarNovamente()) {
                        System.out.printf("Errou! Tente novamente. \n A palavra embaralhada é: '%s'%n", palavraEmbaralhada);
                        System.out.print("Digite seu palpite: ");
                        if (mecanica.respostaCerta(palavra, scan.nextLine())) {
                            System.out.println("Parabéns, você acertou!");
                            break;
                        } else
                            System.out.println("Errou! O número máximo de tentativas para essa palavra foi atingido. ");
                    }
                }

            } else {
                System.out.printf("Parabéns! Você completou o jogo. Sua pontuação total foi de %d pontos. %n", mecanica.getPontos());
                System.exit(0);
            }
        }

        System.out.printf("Fim de Jogo! Você cometeu %d erros. Sua pontuação total foi de %d pontos. %n", mecanica.getQuantidadeMaximaDeErros(), mecanica.getPontos());
        System.exit(0);
    }
}
