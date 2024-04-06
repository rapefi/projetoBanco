package teste.conta;

import teste.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaRegistroAcoes {

    private LocalDate data;
    private String tipoTransacao;

    private BigDecimal valorPretendido;
    private BigDecimal valoreReal;

    private Usuario usuarioOrigem;

    private Usuario usuarioDestino;

    private String observacoes;

    @Override
    public String toString() {
        return "ContaRegistroAcoes{" +
                "data=" + data +
                ", tipoTransacao='" + tipoTransacao + '\'' +
                ", valorPretendido=" + valorPretendido +
                ", valoreReal=" + valoreReal +
                ", usuarioOrigem=" + usuarioOrigem +
                ", usuarioDestino=" + usuarioDestino +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public BigDecimal getValorPretendido() {
        return valorPretendido;
    }

    public void setValorPretendido(BigDecimal valorPretendido) {
        this.valorPretendido = valorPretendido;
    }

    public BigDecimal getValoreReal() {
        return valoreReal;
    }

    public void setValoreReal(BigDecimal valoreReal) {
        this.valoreReal = valoreReal;
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

    public ContaRegistroAcoes(LocalDate data, String tipoTransacao, BigDecimal valorPretendido, BigDecimal valoreReal, Usuario usuarioOrigem, Usuario usuarioDestino, String observacoes) {
        this.data = data;
        this.tipoTransacao = tipoTransacao;
        this.valorPretendido = valorPretendido;
        this.valoreReal = valoreReal;
        this.usuarioOrigem = usuarioOrigem;
        this.usuarioDestino = usuarioDestino;
        this.observacoes = observacoes;
    }

    public ContaRegistroAcoes(LocalDate data) {
        this.data = data;
    }


}
