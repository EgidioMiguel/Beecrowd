package application;

import java.util.Scanner;

public class Beecrowd_1131 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = 1;
		int grenais = 0;
		int vInter 	= 0;
		int vGremio = 0;
		int empate 	= 0;
		
		while(n==1) {
		int inter = sc.nextInt();
		int gremio = sc.nextInt();
		grenais++;
		if(inter > gremio) {
			vInter++;
		}
		if(inter == gremio) {
			empate++;
		}
		if(gremio>inter) {
			vGremio++;
		}
		
		System.out.println("Novo grenal (1-sim 2-nao)");
		n = sc.nextInt();
		while(n!=1&&n!=2){
			System.out.println("Novo grenal (1-sim 2-nao)");
			n = sc.nextInt();
		}
		
		}
		
		System.out.println(grenais+" grenais");
		System.out.println("Inter:"+vInter);
		System.out.println("Gremio:"+vGremio);
		System.out.println("Empates:"+empate);
		if(vGremio>vInter) {System.out.println("Gremio venceu mais");}
		if(vGremio<vInter){System.out.println("Inter venceu mais");}
		if(vGremio==vInter) {System.out.println("Nao houve vencedor");}
		
		
		

sc.close();	}

}
