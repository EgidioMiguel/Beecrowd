package application;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1118 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int vl = 0;
		double soma	 = 0.0;		
		
		while(vl<2) {
		double nt = sc.nextDouble();
		if(nt<0||nt>10) {
			System.out.println("nota invalida");
		}else {	soma+=nt;
			vl++;}		}		
		
		System.out.printf("media = %.2f%n",(soma/vl));
				
		int end = 0;
		
		while(end==0) {
		System.out.println("novo calculo (1-sim 2-nao)");
		int nw = sc.nextInt();	
		
		int wh = 0;		
		
		if(nw<1||nw>2)
		while(wh==0) {
			System.out.println("novo calculo (1-sim 2-nao)");
			nw = sc.nextInt();
			if(nw==1) {
				wh++;
			}
		}	if(nw==2) {	end++;}
		
		if(nw==1) {			
			int vl2 = 0;
			double soma2	 = 0.0;			
			while(vl2<2) {
			double nt2 = sc.nextDouble();
			if(nt2<0||nt2>10) {
				System.out.println("nota invalida");
			}else {	soma2+=nt2;
				vl2++;}		}			
			System.out.printf("media = %.2f%n",(soma2/vl2));			
		}
		 
		}
		
		
sc.close();	}}


