package application;

import java.util.Scanner;

public class Beecrowd_2006 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int T = sc.nextInt();
		
		int[] competidor = new int[5];
		
		for(int i=0;i<5;i++) {
			competidor[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			if(competidor[i]==T) {
				soma=soma+1;
			}
		}
		
		System.out.println(soma);

sc.close();	}

}
