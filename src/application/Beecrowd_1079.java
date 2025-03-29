package application;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1079 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[][] mat = new double[n][3];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[3].length;j++) {
				mat[i][j]=sc.nextDouble();				
			}	}
		
		
		
		for(int i=0;i<mat.length;i++) {
			double soma = 0;			
				soma=((mat[i][0]*2)+(mat[i][1]*3)+(mat[i][2]*5))/10;
				System.out.printf("%.1f%n",soma);
			}	
		

		
		
		
sc.close();	}

}
