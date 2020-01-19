package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<Conta>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        
        Comparator<Conta> c = new ComparaContas();
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        
        System.out.println("--------------");
        
        lista.sort(c);
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
 
class ComparaContas implements Comparator<Conta>{

	public int compare(Conta o1, Conta o2) {
		
		if(o1.getNumero() < o2.getNumero()) {
			return -1;
		}
		
		if(o1.getNumero() > o2.getNumero()) {
			return 1;
		}
		
		return 0;
	}


}

