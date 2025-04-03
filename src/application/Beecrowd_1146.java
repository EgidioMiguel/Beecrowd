package application;


import java.util.Scanner;

public class Beecrowd_1146 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			int x = sc.nextInt();
			if(x==0)break;
			
			StringBuilder sqc = new StringBuilder();
			for(int i=1; i<=x;i++) {
				if(i>1)sqc.append(" ");
				sqc.append(i);
			}
			System.out.println(sqc);
		}
	}
}
