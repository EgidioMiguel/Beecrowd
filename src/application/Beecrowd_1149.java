package application;

import java.util.Scanner;

public class Beecrowd_1149 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int X;
		int resultado=0;
		while ((X = sc.nextInt()) <= 0) {
		}
		for (int i = 0; i < X; i++) {
			resultado = resultado + A+i;
		}
		System.out.println(resultado);

		sc.close();
	}

}
