public class Autoridade implements FormatadorNome {

    private String nome;
    private String sobrenome;
    private FormatadorNome formatadorNome;


    public Autoridade(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }


    String getTratamento() {
        return this.formatadorNome.formatarNome(nome, sobrenome);
    }

    void setFormatadorInformal() {
        this.formatadorNome = (nome, sobrenome) -> nome;
    }

    void setFormatadorRespeitoso(String genero) {
        if (genero.equals("feminino"))
            this.nome = "Sra. " + nome;
        else
            this.nome = "Sr. " + nome;

        this.formatadorNome = (nome, sobrenome) -> nome + " " + sobrenome;
    }

    void setFormatadorTitulo(String titulo) {
        this.nome = titulo + " " + nome;
        this.formatadorNome = (nome, sobrenome) -> nome + " " + sobrenome;

    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return null;
    }
}
