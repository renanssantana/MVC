package fatecrl.mvcTeste.models;

public class Filmes {

    private String nome;
    private String classificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificao) {
        this.classificacao = classificacao;
    }

    public Filmes(String nome, String classificacao) {
        this.nome = nome;
        this.classificacao = classificacao;
    }
}