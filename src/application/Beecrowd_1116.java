package application;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1116 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0");
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		int[]x = new int[n];
		int[]y = new int[n];
		
		for(int i=0;i<n;i++) {
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(y[i]==0) {
				System.out.println("divisao impossivel");
			}else {
				double divisao = (double)x[i]/(double)y[i];
				System.out.println(df.format(divisao));
			}
			
		}
		
		
		

sc.close();	}}
