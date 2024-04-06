package teste.conta;

import teste.conta.interfaces.ContasOperacoesInterface;
import teste.enums.ClassificacaoEnum;
import teste.enums.StatusEnum;
import teste.enums.TipoTransacaoEnum;
import teste.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ContaCorrente extends Conta implements ContasOperacoesInterface {


    private ContaInvestimento contaInvestimento;



    public ContaCorrente(Long id, BigDecimal saldo, LocalDate dataAtualizacao, StatusEnum status, Usuario usuario, ContaInvestimento contaInvestimento) {
        super(id, saldo, dataAtualizacao, status, usuario);
        this.contaInvestimento = contaInvestimento;
    }



    public ContaCorrente(Long id, BigDecimal saldo, LocalDate dataAtualizacao, StatusEnum status, Usuario usuario) {
        super(id, saldo, dataAtualizacao, status, usuario);
    }

    @Override
    public void saque(BigDecimal valor, Usuario usuario) {
        BigDecimal valorSaque=null;

        if (valor.compareTo(saldo) <=0 ){

            if (usuario.getClassificacao().equals(ClassificacaoEnum.PJ)){
                valorSaque = valor.multiply(BigDecimal.valueOf(1.005));
                saldo = saldo.subtract(valor);

            }else{ //poupanca
                saldo = saldo.subtract(valor);
                valorSaque = valor;
            }
            ContaHistoricoOp.registra(getListaRegistroOperecoes(), valor, valorSaque, TipoTransacaoEnum.SAQUE, usuario, usuario, "Saque Conta Realizado");
            System.out.println("Saque realizado");



        }else{
            ContaHistoricoOp.registra(getListaRegistroOperecoes(), valor, valorSaque, TipoTransacaoEnum.SAQUE, usuario, usuario, "Nao foi possivel completar a transacao saldo insuficienre");
            System.out.println("Saldo Insuficiente");
        }

    }

    @Override
    public void deposito(BigDecimal valor, Usuario usuario) {

        saldo.add(valor);
        System.out.println("Deposito realizado com sucesso");

        ContaHistoricoOp.registra(getListaRegistroOperecoes(), valor, valor, TipoTransacaoEnum.DEPOSITO, usuario, usuario, "Deposito realizado");
    }

    @Override
    public void transferencia(BigDecimal valor, Usuario usuarioOrigem, Conta contaDestino) {

        saque(valor, usuarioOrigem);
        contaDestino.setSaldo(valor);
        System.out.println("Transferencia realizado com sucesso");
        ContaHistoricoOp.registra(getListaRegistroOperecoes(), valor, valor, TipoTransacaoEnum.TRANSFERENCIA, usuarioOrigem, contaDestino.getUsuario(), "Transferencia realizado");
    }





    public void investimento(BigDecimal valor, ContaInvestimento contaInvestimento) {
        System.out.println("aaa");
    }

    @Override
    public BigDecimal consultaSaldo(BigDecimal valor) {
        return saldo;
    }


    public ContaInvestimento getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(ContaInvestimento contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }


}
