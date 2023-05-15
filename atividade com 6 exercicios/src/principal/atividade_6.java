package principal;

import java.util.Scanner;

public class atividade_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);
		
        double tempCelsius;
		
		System.out.println(" Qual a temperatura em Celsius:");
	    tempCelsius = leia.nextDouble (); 
	    
	    double tempFahrenheit = (tempCelsius * 1.8 + 32 );
	    
	    System.out.println("A temperatura em grau Fahrenheit é: " + tempFahrenheit);
	}

}
