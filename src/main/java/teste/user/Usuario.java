package teste.user;

import teste.enums.ClassificacaoEnum;
import teste.enums.StatusEnum;

import java.time.LocalDate;

public class Usuario {
    private String id;
    private ClassificacaoEnum classificacao;
    private String nome;

    private LocalDate dataCadastro;

    private StatusEnum status;


    public Usuario(String id) {
        this.id = id;
    }

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ClassificacaoEnum getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(ClassificacaoEnum classificacao) {
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
}
