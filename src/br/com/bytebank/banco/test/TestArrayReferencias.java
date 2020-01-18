package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] contas = new Object[5];
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(22, 22);
		contas[1] = cc2;		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Rodrigo");
		
		contas[3] = cliente;
		//System.out.println(cc2.getNumero());

		ContaPoupanca cp = new ContaPoupanca(3333, 333333);
		contas[2] = cp;
		
		ContaPoupanca cc3 = (ContaPoupanca) contas[2];
		
//		System.out.println(contas[1].getNumero());
//		System.out.println(contas[2].getNumero());
		
		ContaCorrente ref = (ContaCorrente) contas[1];
		
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
