package application;

import java.util.Scanner;

public class Beecrowd_1144 {

	public static void main(String[] args) {

			
			Scanner sc = new Scanner(System.in);
			
			int n = sc.nextInt();
			
			for(int i=1;i<=n;i++) {
				System.out.println(i+" "+(i*i)+" "+(i*(i*i)));
				System.out.println(i+" "+((i*i)+1)+" "+((i*(i*i))+1));
			}
			
	sc.close();	}

	}
