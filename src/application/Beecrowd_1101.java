package application;

import java.util.Scanner;

public class Beecrowd_1101 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int sum,m,n;
		
		while(((m=sc.nextInt())>0)&&((n=sc.nextInt())>0)) {
			sum=0;
			if(m<n) {
				for(m=m;m<=n;m++) {	System.out.print(m + " ");	sum+=m;	}
				System.out.println("Sum="+sum);	}
			else {
				for(n=n;n<=m;n++) {	System.out.print(n + " ");	sum+=n;	}
				System.out.println("Sum="+sum);	}
			}
		
		
		
		
	sc.close();}

}
