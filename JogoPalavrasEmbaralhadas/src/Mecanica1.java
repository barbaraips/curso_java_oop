
public class Mecanica1 implements MecanicaDoJogo {

    private final int maxErros = 2;
    private final Embaralhador embaralhador;
    private int pontos = 0;
    private int quantidadeErros = 0;
    private int quantidadeTentativas = 0;

    Mecanica1() {
        this.embaralhador = FabricaEmbaralhadores.getEmbaralhadorAleatorio();
    }

    @Override
    public boolean fimDeJogo() {
        return quantidadeErros >= maxErros;
    }

    @Override
    public boolean respostaCerta(String palavra, String palavraDoUsuario) {
        if (palavra.equalsIgnoreCase(palavraDoUsuario)) {
            this.calculaPontos(palavraDoUsuario);
            return true;
        }
        if (tentarNovamente()) {
            quantidadeTentativas++;
            return false;
        }
        return false;
    }

    @Override
    public String getPalavraEmbaralhada(String palavra) {
        return this.embaralhador.embaralhador(palavra);
    }

    private void calculaPontos(String palavra) {
        this.pontos += palavra.length() - quantidadeErros;
    }

    @Override
    public int getPontos() {
        return pontos;
    }

    @Override
    public int getQuantidadeMaximaDeErros() {
        return maxErros;
    }

    @Override
    public boolean tentarNovamente() {
        int maxTentativas = 3;
        if (quantidadeTentativas == maxTentativas) {
            quantidadeErros++;
            quantidadeTentativas = 0;
            return false;
        }
        return true;
    }

}
