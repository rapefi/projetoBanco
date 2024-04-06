package teste.conta.interfaces;

import java.math.BigDecimal;

public interface ContasOperacoesInterface {


    public void saque(BigDecimal valor);

    public void deposito(BigDecimal valor);

    public void trasnsferencia(BigDecimal valor, Long idConta);

    public BigDecimal consultaSaldo(BigDecimal valor);
}
