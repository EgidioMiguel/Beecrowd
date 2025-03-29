package application;

import java.util.Scanner;

public class Beecrowd_1099 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	
	int[]x=new int[n];
	int[]y=new int[n];
	
	//primeiro for 
	for(int i=0;i<n;i++) {
		x[i]= sc.nextInt();
		y[i]= sc.nextInt();	}	
	//segundo for
	for(int i=0;i<n;i++) {
		int soma = 0;		
		
		if(x[i]==y[i]) {
			System.out.println(soma);}		
		
		if (x[i]>y[i]) {
			for(int j=x[i];j!=y[i];j--){
				if(j%2!=0) {soma+=j;}}
				if(x[i]%2!=0) {	soma=soma-x[i];	}
				System.out.println(soma);	}		
		
		if(y[i]>x[i]) {
			for(int j=y[i];j!=x[i];j--)	{			
				if(j%2!=0) {soma+=j;}}
				if(y[i]%2!=0) {	soma=soma-y[i];
				}System.out.println(soma);	}			
		}		
	
sc.close();	}}
