package teste.enums;

public enum TipoTransacaoEnum {
    SAQUE("SAQUE DA CONTA"),
    DEPOSITO("DEPOSITO NA CONTA"),
    TRANSFERENCIA("TRANSFERENCIA DE VALOR DA CONTA"),
    INVESTIMENTO("VALOR INVESTIDO"),
    CONSULTA_SALDO("CONSULTA DE SALDO");


    private String descricao;

    TipoTransacaoEnum(String descricao) {
        this.descricao = descricao;
    }

    private String getDescricao(){
        return descricao;
    }
}
