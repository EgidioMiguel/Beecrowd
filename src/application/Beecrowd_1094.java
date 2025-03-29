package application;

import java.util.Locale;
import java.util.Scanner;

public class Beecrowd_1094 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);	
	Scanner sc = new Scanner(System.in);
	
	int n = sc.nextInt();
	String[] tipo = new String[n];
	int[] quantia = new int[n];
	
	for(int i=0;i<n;i++) {
		quantia[i]=sc.nextInt();
		tipo[i]=sc.next();
	}
	
	int total = 0;
	int coelhos = 0;
	int ratos = 0;
	int sapos = 0;
	
	for(int i=0;i<n;i++) {
		total = total+quantia[i];
		if(tipo[i].contains("C")){
		coelhos = coelhos+quantia[i];	}
		if(tipo[i].contains("R")){
			ratos = ratos+quantia[i];	}
		if(tipo[i].contains("S")){
			sapos = sapos+quantia[i];	}
	}
	
	double pCoelhos = ((double)coelhos/total)*100;
	double pRatos = ((double)ratos/total)*100;
	double pSapos = ((double)sapos/total)*100;
	
	System.out.println("Total: "+total+" cobaias");
	System.out.println("Total de coelhos: "+coelhos);
	System.out.println("Total de ratos: "+ratos);
	System.out.println("Total de sapos: "+sapos);
	System.out.println(String.format("Percentual de coelhos: %.2f",pCoelhos)+" %");
	System.out.println(String.format("Percentual de ratos: %.2f",pRatos)+" %");
	System.out.println(String.format("Percentual de sapos: %.2f",pSapos)+" %");
	
	sc.close();}

}
