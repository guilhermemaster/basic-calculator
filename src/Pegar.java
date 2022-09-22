import java.util.Scanner;

import calculate.Soma;

public class Pegar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Soma sm = new Soma();
		
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

		if (operation == 0) {
			System.out.print("Fim");
		}		
		
	}

}
