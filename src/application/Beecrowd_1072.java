package application;

import java.util.Scanner;

public class Beecrowd_1072 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int out = 0;
		int in  = 0;
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			int x = sc.nextInt();
			if(x>=10&&x<=20) {
			in++;	
			}else {
				out++;
			}
		}
		
		
		System.out.println(in+" in");
		System.out.println(out+" out");

sc.close();	}

}
