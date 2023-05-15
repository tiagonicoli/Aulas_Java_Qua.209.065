import java.util.Scanner;

public class atividadeextra02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner (System.in);
		
		double salBruto;
		
		System.out.println("qual o valor de seu salrio bruto: ");
		salBruto = leia.nextDouble();
		
		double descInss = (salBruto * 5/100 );
		double descIr = (salBruto * 11/100);
		double salLiquido = (salBruto - descInss - descIr);
		double totalDesc = descInss + descIr;
		
		System.out.println("O valor total dos descontos é: " + totalDesc);
		System.out.println("Seu salario liquido é: " + salLiquido);

	}

}
