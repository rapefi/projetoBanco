package teste.conta.interfaces;

import teste.conta.Conta;
import teste.conta.ContaCorrente;
import teste.user.Usuario;

import java.math.BigDecimal;

public interface ContasOperacoesInterface {


    public void saque(BigDecimal valor, Usuario usuario);

    public void deposito(BigDecimal valor, Usuario usuario);

    public void transferencia(BigDecimal valor, Usuario usuarioOrigem, Conta conta);

    public BigDecimal consultaSaldo(BigDecimal valor);
}
