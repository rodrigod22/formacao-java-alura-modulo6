package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//Generics
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Rodrigo");
		
		Conta cc = new ContaCorrente(1111, 111111);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(2222, 22222);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println(lista.size());
		
		Conta cc3 = new ContaCorrente(3333, 33333);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(4444, 44444);
		lista.add(cc4);
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}
		
		System.out.println("---------------------");
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
	}

}
