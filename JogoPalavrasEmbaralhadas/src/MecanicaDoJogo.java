interface MecanicaDoJogo {

    boolean fimDeJogo();

    boolean respostaCerta(String palavra, String palavraDoUsuario);

    boolean tentarNovamente();

    String getPalavraEmbaralhada(String palavra);

    int getPontos();

    int getQuantidadeMaximaDeErros();
}
