

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int ano;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("informe um ano: ");
		ano = leia.nextInt();
		
		if(ano % 4 == 0) {
			System.out.println(ano + " Est� ano e Bissexto!");
		}else {
			System.out.println("Est� ano n�o e Bissexto");
		}
	}

}