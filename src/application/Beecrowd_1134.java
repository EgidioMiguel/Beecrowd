package application;

import java.util.Scanner;

public class Beecrowd_1134 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n         = 0;		
		int alcool1   = 0;
		int gasolina2 = 0;
		int diesel3   = 0;
		
		while(n!=4) {
			n=sc.nextInt();
			if(n==1) {
				alcool1++;
			}
			if(n==2) {
				gasolina2++;
			}
			if(n==3) {
				diesel3++;			
			}
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool1);
		System.out.println("Gasolina: "+gasolina2);
		System.out.println("Diesel: "+diesel3);
		
		sc.close();	}

}
