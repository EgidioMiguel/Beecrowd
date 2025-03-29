package application;

import java.util.Scanner;

public class Beecrowd_1114 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		
		int x;
		
		while((x=sc.nextInt())!=senha) {
			System.out.println("Senha Invalida");
		}
		
		if(x==senha) {
			System.out.println("Acesso Permitido");
		}
		
		
		
		
sc.close();	}}
