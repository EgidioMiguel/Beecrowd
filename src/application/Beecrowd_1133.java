package application;

import java.util.Scanner;

public class Beecrowd_1133 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int n;
		
		
		if(x<y) {
			n=x+1;
		while (n<y) {
			if(n%5==2||n%5==3) {
				System.out.println(n);
			}	n++;	}}
		if(x>y) {
			n=y+1;
		while (n<x) {
			if(n%5==2||n%5==3) {
				System.out.println(n);
			}
			n++;
		}
		
		}

sc.close();	}

}
