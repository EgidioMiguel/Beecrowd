package application;

import java.util.Scanner;

public class Beecrowd_1151 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int anterior = 0;
		int proximo = 1;

		StringBuilder stb = new StringBuilder();
		for (int i = 2; i < n; i++) {
			stb.append(" ");
			if (anterior < proximo) {
				anterior = proximo + anterior;
				stb.append(anterior);
			} else {
				proximo = proximo + anterior;
				stb.append(proximo);
			}
		}
		
		System.out.println("0 1"+stb);

		sc.close();
	}
}
