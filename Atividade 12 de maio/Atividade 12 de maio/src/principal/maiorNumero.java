

import java.util.Scanner;

public class maiorNumero {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		int num3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o 1� numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Informe o 2� numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Informe o 3� numero: ");
		num3 = leia.nextInt();
		
		leia.close();
		
		if((num1 > num2)||(num1>num3)){
				System.out.println("O valor maior digitado e: " + num1);
				System.exit(0);
			}if((num2 > num1)||(num2>num3)) {
				System.out.println("O valor maior digitado e: " + num2);
			}else {
				System.out.println("O valor maior digitado e: " + num3);
			}

	}

}