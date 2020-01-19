package br.com.bytebank.banco.test;

import java.util.ArrayList;
import java.util.List;

public class TesteUnboxingAutoboxing {

	public static void main(String[] args) {

		int[]idades = new int[5];
		int idade = 29;
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		Integer idadeRef = Integer.valueOf(29); 
		int valor = idadeRef.intValue();
		
		System.out.println(idadeRef.floatValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);

		String s = args[0];
		
		//Integer numero = Integer.valueOf(s);
		Integer numero = Integer.parseInt(s);
		System.out.println(numero);
		
		numeros.add(idade); //autoboxing - tranforma o primitivo em objeto da classe Integer
			
	}

}
