package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardaContas;

public class TesteGuardaContas {

	public static void main(String[] args) {

		GuardaContas guardador = new GuardaContas();
		
		ContaCorrente cc = new ContaCorrente(1111, 111111);
		ContaCorrente cc2 = new ContaCorrente(2222, 222222);
		
		guardador.adiciona(cc);
		guardador.adiciona(cc2);
		
		int tamanho = guardador.getTamanho();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		System.out.println(ref);

	}

}
