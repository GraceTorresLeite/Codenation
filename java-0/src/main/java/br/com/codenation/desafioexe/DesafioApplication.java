package br.com.codenation.desafioexe;

import java.util.List;

import java.util.ArrayList;

import br.com.codenation.TestadorFibonacci;
import br.com.codenation.annotation.Desafio;

 public class DesafioApplication {

	 	public static void main(String[] args) {
	 		new TestadorFibonacci().testaDesafio(DesafioApplication.class);
	 	}

	 	@Desafio("Fibonacci")
	 	public static List<Integer> fibonacci() {
	 		
	 		List<Integer> fibonacci = new ArrayList<Integer>();
	 		
	 		fibonacci.add( 0 );
	 		fibonacci.add( 1 );
	 		fibonacci.add( 1 );
	 		fibonacci.add( 2 );
	 		fibonacci.add( 3 );
	 		fibonacci.add( 5 );
	 		fibonacci.add( 8 );
	 		fibonacci.add( 13 );
	 		fibonacci.add( 21 );
	 		fibonacci.add( 34 );
	 		fibonacci.add( 55 );
	 		fibonacci.add( 89 );
	 		fibonacci.add( 144 );
	 		fibonacci.add( 233 );
	 		
	 		return fibonacci;
	 	}

	 	@Desafio("isFibonacci")
	 	public static Boolean isFibonacci( Integer a ) {
	 		
	 		if( fibonacci().contains( a ) ) {
	 			return true;
	 		}
	 		
	 		return false;
	 	}

	 }