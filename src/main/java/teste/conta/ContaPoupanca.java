package teste.conta;

import teste.conta.interfaces.ContasOperacoesInterface;
import teste.enums.ClassificacaoEnum;
import teste.enums.TipoTransacaoEnum;
import teste.user.Usuario;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta implements ContasOperacoesInterface {
    @Override
    public void saque(BigDecimal valor, Usuario usuario) {
        BigDecimal valorSaque=null;

        if (valor.compareTo(saldo) <=0 ){

            saldo = saldo.subtract(valor);

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





    @Override
    public BigDecimal consultaSaldo(BigDecimal valor) {
        return saldo;
    }





}
