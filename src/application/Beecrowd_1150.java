package application;

import java.util.Scanner;

public class Beecrowd_1150 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int z = sc.nextInt();

		while (z <= x) {
			z = sc.nextInt();
		}

		int soma = 0;
		int sequencia = x;
		int quantia = 0;

		while (soma < z) {
			soma = soma + sequencia;
			sequencia++;
			quantia++;
		}
		System.out.println(soma);
		System.out.println(quantia);

		sc.close();
	}

}
