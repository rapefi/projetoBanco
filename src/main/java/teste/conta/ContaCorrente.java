package teste.conta;

import teste.conta.interfaces.ContasOperacoesInterface;

import java.math.BigDecimal;

public class ContaCorrente extends Conta implements ContasOperacoesInterface {
    @Override
    public void saque(BigDecimal valor) {
        if (valor.compareTo(saldo) <=0 ){
            saldo = saldo.subtract(valor);

        }

    }

    @Override
    public void deposito(BigDecimal valor) {

        saldo.add(valor);

    }

    @Override
    public void trasnsferencia(BigDecimal valor, Long idConta) {

    }

    @Override
    public BigDecimal consultaSaldo(BigDecimal valor) {
        return saldo;
    }
}
