package dev.gabriel.java10x.Vaggo.core.emuns;

public enum TipoVaga {

    CLT("CLT"),
    PJ("Pessoa Jurídica"),
    ESTAGIO("Estágio"),
    APRENDIZ("Jovem Aprendiz"),
    TEMPORARIO("Temporário"),
    FREELANCER("Freelancer"),
    TRAINEE("Trainee"),
    TERCEIRIZADO("Terceirizado"),
    INTERMITENTE("Intermitente"),
    COOPERADO("Cooperado");

    private final String descricao;

    TipoVaga(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
