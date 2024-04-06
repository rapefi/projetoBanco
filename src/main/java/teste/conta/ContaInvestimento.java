package teste.conta;

import teste.conta.interfaces.ContasOperacoesInterface;
import teste.enums.ClassificacaoEnum;
import teste.enums.StatusEnum;
import teste.enums.TipoTransacaoEnum;
import teste.user.Usuario;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

public class ContaInvestimento extends ContaCorrente implements ContasOperacoesInterface {

    public static Map<Integer, Boolean> mapPagamentosMesBoolean = new HashMap<>();
    public static String mesCriacao = String.valueOf(LocalDate.from(LocalDate.now().getMonth()));


    public ContaInvestimento(Long id, BigDecimal saldo, LocalDate dataAtualizacao, StatusEnum status, Usuario usuario, ContaInvestimento contaInvestimento) {
        super(id, saldo, dataAtualizacao, status, usuario, contaInvestimento);
    }



    public void calculaRedimentos(ClassificacaoEnum classificacaoEnum){

        String mes = String.valueOf(LocalDate.now().getMonth());

        mapPagamentosMesBoolean.put(Integer.valueOf(mesCriacao), true);



        if (mapPagamentosMesBoolean.containsKey(mes)){

            mapPagamentosMesBoolean.put(Integer.valueOf(mes), true);
            if (classificacaoEnum.equals(ClassificacaoEnum.PF)){
                saldo = saldo.multiply(BigDecimal.valueOf(1.01));

            }else { //pj
                saldo = saldo.multiply(BigDecimal.valueOf(1.02));
            }


        }
    }








}
