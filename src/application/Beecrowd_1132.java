package application;

import java.util.Scanner;

public class Beecrowd_1132 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int sum = 0;
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>y) {
			for(int i=y;i<=x;i++) {				
					if(i%13!=0) {
					sum+=i;
				}}}
		if(x<y) {
			for(int i=x;i<=y;i++) {				
					if(i%13!=0) {
					sum+=i;
				}}}
			
		System.out.println(sum);
				
sc.close();	}

}
