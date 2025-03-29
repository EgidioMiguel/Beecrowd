package application;

import java.util.Scanner;

public class Beecrowd_1061 {
	public static void main(String[] args) {		
		
		Scanner sc = new Scanner(System.in);
		
		String[] di = sc.nextLine().split(" ");
		String[] hi = sc.nextLine().replaceAll(" ", "").split(":");
		String[] df = sc.nextLine().split(" ");
		String[] hf = sc.nextLine().replaceAll(" ", "").split(":");
		
		int diaInicial 	   = Integer.parseInt(di[1]);
		int horaInicial    = Integer.parseInt(hi[0]);
		int minutoInicial  = Integer.parseInt(hi[1]);
		int segundoInicial = Integer.parseInt(hi[2]);
		
		int diaFinal 	   = Integer.parseInt(df[1]);
		int horaFinal      = Integer.parseInt(hf[0]);
		int minutoFinal    = Integer.parseInt(hf[1]);
		int segundoFinal   = Integer.parseInt(hf[2]);			
		
		int segundoTotal = segundoFinal - segundoInicial;		
		if(segundoTotal < 0) {
			segundoTotal = segundoTotal + 60;
			minutoFinal = minutoFinal-1;}
		
		int minutoTotal = minutoFinal - minutoInicial;		
		if(minutoTotal<0) {
			minutoTotal = minutoTotal + 60;
			horaFinal = horaFinal-1;}
		
		int horaTotal = horaFinal - horaInicial;		
		if(horaTotal<0) {
			horaTotal = horaTotal + 24;
			diaFinal = diaFinal-1;}
		
		int diaTotal = diaFinal - diaInicial;
		
		System.out.println(diaTotal + " dia(s)");
		System.out.println(horaTotal + " hora(s)");
		System.out.println(minutoTotal + " minuto(s)");
		System.out.println(segundoTotal + " segundo(s)");
		
		
	sc.close();	}}
