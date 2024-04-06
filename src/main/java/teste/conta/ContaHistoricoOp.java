package teste.conta;

import teste.enums.TipoTransacaoEnum;
import teste.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class ContaHistoricoOp {

    public static void registra(List<ContaRegistroAcoes> listaContaRegistroAcoes, BigDecimal valorPretendido,
                                BigDecimal valorReal,
                                TipoTransacaoEnum tipoTransacaoEnums,
                                Usuario usuarioOrigem,
                                Usuario usuarioDestino,
                                String obs){

        ContaRegistroAcoes contaRegistroAcoes = new ContaRegistroAcoes();
        contaRegistroAcoes.setData(LocalDateTime.now());
        contaRegistroAcoes.setTipoTransacao(tipoTransacaoEnums);
        contaRegistroAcoes.setValorPretendido(valorPretendido);
        contaRegistroAcoes.setValorReal(valorReal);
        contaRegistroAcoes.setUsuarioOrigem(usuarioOrigem);
        contaRegistroAcoes.setUsuarioDestino(usuarioDestino);
        contaRegistroAcoes.setObservacoes(obs);

        listaContaRegistroAcoes.add(contaRegistroAcoes);



    }

}
