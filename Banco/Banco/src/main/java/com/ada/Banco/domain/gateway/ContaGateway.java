package com.ada.Banco.domain.gateway;

import com.ada.Banco.domain.model.Conta;

public interface ContaGateway {
    Conta buscarPorCpf(String cpf);
    Conta salvar(Conta conta);
}
