package application;

import java.util.Scanner;

public class Beecrowd_1154 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int n = sc.nextInt();
		int x = 0;
		double media;
		while(n >=0 ) {
			
			soma=soma+n;
			n=sc.nextInt();
			x++;
		}
		media = (double)soma/x;
		System.out.println(String.format( "%.2f" , media));
		
sc.close();	}

}
