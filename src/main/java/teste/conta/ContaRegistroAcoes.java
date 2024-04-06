package teste.conta;

import teste.enums.TipoTransacaoEnum;
import teste.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class ContaRegistroAcoes {

    private LocalDateTime data;
    private TipoTransacaoEnum tipoTransacao;

    private BigDecimal valorPretendido;
    private BigDecimal valorReal;

    private Usuario usuarioOrigem;

    private Usuario usuarioDestino;

    private String observacoes;

    @Override
    public String toString() {
        return "ContaRegistroAcoes{" +
                "data=" + data +
                ", tipoTransacao='" + tipoTransacao + '\'' +
                ", valorPretendido=" + valorPretendido +
                ", valorReal=" + valorReal +
                ", usuarioOrigem=" + usuarioOrigem +
                ", usuarioDestino=" + usuarioDestino +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public TipoTransacaoEnum getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacaoEnum tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public BigDecimal getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(BigDecimal valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public BigDecimal getValorReal() {
        return valorReal;
    }

    public void setValorReal(BigDecimal valorReal) {
        this.valorReal = valorReal;
    }

    public Usuario getUsuarioOrigem() {
        return usuarioOrigem;
    }

    public void setUsuarioOrigem(Usuario usuarioOrigem) {
        this.usuarioOrigem = usuarioOrigem;
    }

    public Usuario getUsuarioDestino() {
        return usuarioDestino;
    }

    public void setUsuarioDestino(Usuario usuarioDestino) {
        this.usuarioDestino = usuarioDestino;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }


    public ContaRegistroAcoes() {
    }
}
