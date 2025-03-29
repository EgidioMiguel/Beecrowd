package application;

import java.util.Scanner;

public class Beecrowd_1115 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x,y;
		
		while((x=sc.nextInt())!=0&&(y=sc.nextInt())!=0) {
			
			if(x>0&&y>0) {
				System.out.println("primeiro");
			}		
			if(x<0&&y>0) {
				System.out.println("segundo");
			}
			if(x<0&&y<0) {
				System.out.println("terceiro");
			}
			if(x>0&&y<0) {
				System.out.println("quarto");
			}			
		}
		

sc.close();	}}
