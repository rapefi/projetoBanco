package teste.conta;

import teste.enums.StatusEnum;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Conta {

     Long id;
    protected BigDecimal saldo;

    private LocalDate dataAtualizacao;

    private StatusEnum status;

    private String idUsuario;

    private List<ContaRegistroAcoes> listaRegistroOperecoes;


    public Conta() {
    }

    public Conta(Long id, BigDecimal saldo, LocalDate dataAtualizacao, StatusEnum status, String idUsuario) {
        this.id = id;
        this.saldo = saldo;
        this.dataAtualizacao = dataAtualizacao;
        this.status = status;
        this.idUsuario = idUsuario;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public void setDataAtualizacao(LocalDate dataAtualizacao) {
        this.dataAtualizacao = dataAtualizacao;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public List<ContaRegistroAcoes> getListaRegistroOperecoes() {
        return listaRegistroOperecoes;
    }

    public void setListaRegistroOperecoes(List<ContaRegistroAcoes> listaRegistroOperecoes) {
        this.listaRegistroOperecoes = listaRegistroOperecoes;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", saldo=" + saldo +
                ", dataAtualizacao=" + dataAtualizacao +
                ", status=" + status +
                ", idUsuario='" + idUsuario + '\'' +
                '}';
    }


}
