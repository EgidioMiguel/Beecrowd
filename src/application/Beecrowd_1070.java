package application;

import java.util.Scanner;

public class Beecrowd_1070 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i=0;i<6;) {
			if(x%2!=0) {
				System.out.println(x);
				x++; i++;				
			}else {
				x++;
			}
		}
		
		
	sc.close();}

}
