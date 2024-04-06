package teste.enums;

public enum ClassificacaoEnum {
    PF("Pessoa Fisica"),
    PJ("Pessoa Juridica");

    private String descricao;

    ClassificacaoEnum(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
