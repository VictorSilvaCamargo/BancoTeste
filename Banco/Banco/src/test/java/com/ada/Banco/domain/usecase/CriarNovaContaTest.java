package com.ada.Banco.domain.usecase;

import com.ada.Banco.domain.gateway.ContaGateway;
import com.ada.Banco.domain.model.Conta;
import com.ada.Banco.dummy.ContaGatewayDummyImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class CriarNovaContaTest {
    @Test
    public void deveLançarExceptionCasoUsuarioJaPossuaUmaConta(){
        //Given
        ContaGateway contaGateway = new ContaGatewayDummyImpl();  //Responsavel por  criar uma conta falsa.
        CriarNovaConta criarNovaConta = new CriarNovaConta(contaGateway);

        Conta conta = new Conta(12345L,0002L,3L, BigDecimal.ZERO,"Bruno", "123456789");
        //When
        Assertions.assertThrows(Exception.class,
                ()-> criarNovaConta.execute(conta));

    }
@Test
    public void deveRetornarConta(){
        //Given
        ContaGateway contaGateway = new ContaGatewayDummyImpl();  //Responsavel por  criar uma conta falsa.
        CriarNovaConta criarNovaConta = new CriarNovaConta(contaGateway);

        Conta conta = new Conta(123456L,00020L,3L, BigDecimal.ZERO,"Ligia", "123");

        //When
        Assertions.assertAll(
                ()-> Assertions.assertEquals(conta, criarNovaConta.execute(conta)),
                ()-> Assertions.assertEquals("Ligia",conta.getTitular())
);
    }
}
