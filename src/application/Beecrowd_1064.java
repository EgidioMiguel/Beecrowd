package application;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1064 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int positivo = 0;
		double soma = 0;
		for(int i=0; i<6;i++) {
			double x = sc.nextDouble();
			if(x>0) {
			 positivo++;	
			soma = soma+x;}
		}
		
		double media = soma/positivo;
		
		System.out.println(positivo + " valores positivos");
		System.out.printf("%.1f%n",media);	
		
		
		sc.close();

	}

}
