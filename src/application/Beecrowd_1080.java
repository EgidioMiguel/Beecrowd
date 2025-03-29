
//Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.
//Entrada
//O arquivo de entrada contém 100 números inteiros, positivos e distintos.
//Saída
//Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.

package application;

import java.util.Scanner;

public class Beecrowd_1080 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] x = new int[10];
		
		for(int i=0;i<10;i++) {
			x[i] = sc.nextInt();
		}
		
		int maior = x[0];
		int posicao = 0;
		
		for(int i=0;i<10;i++) {
			
			if(x[i]>=maior) {
			maior = x[i];
			posicao = (i+1);
			
			}
		}
		System.out.println(maior);
		System.out.println((posicao));
		

	sc.close();}

}
