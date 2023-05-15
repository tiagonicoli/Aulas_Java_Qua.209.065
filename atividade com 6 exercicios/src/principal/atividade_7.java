package principal;

import java.util.Scanner;

public class atividade_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
		double tempFahrenheit;
		
		System.out.println(" Qual a temperatura em Fahrenheit:");
	    tempFahrenheit = leia.nextDouble (); 
	    
	    double tempCelsius = (5 * (tempFahrenheit-32)/9);
	    
	    System.out.println("A temperatura em grau Celsius é: " + tempCelsius);

	}

}
