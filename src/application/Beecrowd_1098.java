package application;

import java.text.DecimalFormat;
import java.util.Locale;

public class Beecrowd_1098 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		DecimalFormat df = new DecimalFormat("0.0");
	
		double i = 0, j = 1;
	
		while(i<=2) {
			for(int x =0;x<3;x++) {
				if(df.format(i).endsWith("0")) {
					System.out.println("I="+df.format(i).substring(0, 1)+" J="+df.format(j).substring(0, 1));				
				}else {
					System.out.println("I="+df.format(i)+" J="+df.format(j));
				}
				j++;
			}
			j-=2.8;
			i+=0.2;		}}
	
}


