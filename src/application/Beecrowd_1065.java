package application;

import java.util.Scanner;

public class Beecrowd_1065 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		
		for(int i=0;i<5;i++) {
			int x = sc.nextInt();
			if(x % 2 == 0) {
				soma++;
			}
		}
		System.out.println(soma + " valores pares");

	sc.close();}

}
