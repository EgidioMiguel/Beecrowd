package application;

import java.util.Scanner;

public class Beecrowd_1075 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);	
	
	int n = sc.nextInt();
	
	for(int i=1;i<=10000;i++) {
		if(i%n==2) {
			System.out.println(i);
		}
	}	
	sc.close();}

}
