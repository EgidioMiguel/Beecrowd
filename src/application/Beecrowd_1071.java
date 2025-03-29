package application;

import java.util.Scanner;

public class Beecrowd_1071 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>y) {
	for(int i = x; i!=y;i--) {
		if(i%2!=0) {
			soma = i+soma;
			}		
		}if(x%2!=0) {
			soma=soma-x;
		}
	}
		if(y>x) {
		for(int i = y; i!=x;i--) {
			if(i%2!=0) {
				soma = i+soma;
				
			}}if(y%2!=0) {
				soma=soma-y;}}
		System.out.println(soma);
	sc.close();}

}
