import java.util.Scanner;

import calculate.Multiplicar;
import calculate.Soma;
import calculate.Subtracao;

public class Pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Soma sm = new Soma();
		Subtracao sb = new Subtracao();
		Multiplicar mt = new Multiplicar(); 
		
		int valueBeginPrime, valueBeginSecond = 0;
		
		int operation = 0;
		
		operation = sc.nextInt();
		
		valueBeginPrime = sc.nextInt();
		valueBeginSecond = sc.nextInt();					
		
		if (operation == 1) {
			sm.setValuePrime(valueBeginPrime);
			sm.setValueSecond(valueBeginSecond);
			
			System.out.println(sm.sum());
			
			operation = 0;
		}
		
		if( operation == 2) {
			sb.setValuePrime(valueBeginPrime);
			sb.setValueSecond(valueBeginSecond);
			
			System.out.println(sb.subraction());
			
			operation = 0;
		}
		
		if( operation == 3) {
			mt.setValuePrime(valueBeginPrime);
			mt.setValueSecond(valueBeginSecond);
			
			System.out.println(mt.multiplication());
			
			operation = 0;
		}

		if (operation == 0) {
			System.out.print("Fim");
		}		
		
	}

}
