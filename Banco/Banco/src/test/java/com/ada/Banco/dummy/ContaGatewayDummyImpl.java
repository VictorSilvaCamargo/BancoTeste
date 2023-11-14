package com.ada.Banco.dummy;

import com.ada.Banco.domain.gateway.ContaGateway;
import com.ada.Banco.domain.model.Conta;

import java.math.BigDecimal;

public class ContaGatewayDummyImpl implements ContaGateway {
    @Override
    public Conta buscarPorCpf(String cpf) {
        if (cpf == "123456789"){
            return new Conta(12345L,0002L,3L, BigDecimal.ZERO,"Bruno", "123456789");
        }
        return null;
    }

    @Override
    public Conta salvar(Conta conta) {
        return new Conta (123456L,00020L,3L, BigDecimal.ZERO,"Ligia", "123");
    }
}
