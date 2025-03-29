package application;

import java.util.Scanner;

public class Beecrowd_1142 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		int qt = 0;
		int conta = 0;
		while(qt<n) {
			
			for(int i=0;i<3;i++) {
				conta+=1;
				System.out.print(conta+" ");
			}
			System.out.println("PUM");
			qt++;
			conta++;
		}
		

sc.close();	}

}
