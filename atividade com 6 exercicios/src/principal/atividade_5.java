package principal;

import java.util.Scanner;

public class atividade_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		double valorHora;
		double horasTrab; 
		
		System.out.println("Qual o valor que voc� ganha por hora: ");
		valorHora = leia.nextDouble ();
		
		System.out.println("Quantas horas trabalhadas durante o m�s: ");
		horasTrab = leia.nextDouble ();
		
		double salarioMes = (valorHora*horasTrab);
		
		System.out.println("Seu sal�rio � de: " + salarioMes);

	}

}
