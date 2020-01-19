package br.com.bytebank.banco.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		 //ArrayList<Conta> lista = new ArrayList<Conta>();
		 //LinkedList<Conta> lista = new LinkedList<Conta>();
		
		   // List<Conta> lista = new LinkedList<Conta>();
		
			//GENERICS
			List<Conta> lista = new Vector<Conta>();
			
		    Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);

	        Conta cc2 = new ContaCorrente(22, 22);
	        lista.add(cc2);
	        
	        Conta cc3 = new ContaCorrente(22, 22);
	       
	        boolean existe = lista.contains(cc3);
	        
	        System.out.println(existe);
	        	               
	        for(Conta conta : lista) {	        	
	        	System.out.println(conta);	       	
	        }
	  }

}
