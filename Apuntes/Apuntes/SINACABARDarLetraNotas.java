package Apuntes;

import java.util.Scanner;

public class SINACABARDarLetraNotas {
	public static void main (String[]args){
		Scanner x = new scanner(System.in);
		int nota = x.NextInt();
		
		
	if (nota >= 90) { System.out.print("A");}
	if (nota < 90 && nota > 80) { System.out.print("B");}
	if (nota < 80 && nota > 70) { System.out.print("C");}
	if (nota < 70 && nota > 60) { System.out.print("D");}
	if (nota < 60 && nota > 50) { System.out.print("E");}
	if (nota < 60 && nota > 50) { System.out.print("E");}
	}
}
