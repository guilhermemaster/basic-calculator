import java.util.Scanner;

import calculate.Divisao;
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
		Divisao dv = new Divisao();
		
		int valueBeginPrime = 0;
		int valueBeginSecond = 0;
		
		int operation = 0;		
		
		do {
			System.out.println("Which operation will you want??");
			System.out.println("1 - Sum");
			System.out.println("2 - Subtraction");
			System.out.println("3 - Multiplication");
			System.out.println("4 - Division");
			System.out.println("5 - Exit");

			operation = sc.nextInt();	
			
			if (operation < 5) {
				valueBeginPrime = sc.nextInt();
				valueBeginSecond = sc.nextInt();				
			}		
			
			if (operation == 1) {
				sm.setValuePrime(valueBeginPrime);
				sm.setValueSecond(valueBeginSecond);
				
				System.out.println(sm.sum());
			}
			
			if( operation == 2) {
				sb.setValuePrime(valueBeginPrime);
				sb.setValueSecond(valueBeginSecond);
				
				System.out.println(sb.subraction());
			}
			
			if( operation == 3) {
				mt.setValuePrime(valueBeginPrime);
				mt.setValueSecond(valueBeginSecond);
				
				System.out.println(mt.multiplication());
			}
			
			if( operation == 4) {
				dv.setValuePrime(valueBeginPrime);
				dv.setValueSecond(valueBeginSecond);
				
				System.out.println(dv.division());
			}
			
		}while(operation < 4);

		if (operation > 4) {
			System.out.print("Fim");
		}		
		
	}

}
