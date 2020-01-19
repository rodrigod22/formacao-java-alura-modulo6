package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(28);
		System.out.println(idadeRef.intValue());
		
		//Double dRef = Double.valueOf(3.2);
		Double dRef = 3.2; //autoboxing
		System.out.println(dRef.doubleValue()); // unboxing
		
		Number numero = Integer.valueOf(28);
		System.out.println(numero.intValue());
		
		// Generics NUMBER
		List<Number> lista = new ArrayList<Number>();
		lista.add(10);
		lista.add(3.2);
		lista.add(25.6f);
		
		
	}

}
