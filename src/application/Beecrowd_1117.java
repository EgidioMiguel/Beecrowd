package application;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1117 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int vl = 0;
		double soma	 = 0.0;
		
		
		while(vl<2) {
		double nt = sc.nextDouble();
		if(nt<0||nt>10) {
			System.out.println("nota invalida");
		}else {
			soma+=nt;
			vl++;
		}
		
		}
		System.out.printf("media = %.2f%n",(soma/vl));

sc.close();	}}
