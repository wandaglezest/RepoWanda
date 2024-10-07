package Apuntes;

import java.util.Scanner;

public class DarLetraNotas {
	public static void main (String[]args){
		
		System.out.print("Dame una calificación:");
		Scanner x = new Scanner(System.in);
		int nota = x.nextInt();
		
		
	if (nota >= 90) { System.out.print("La nota es A");}
	else {
		if (nota < 89 && nota >= 80) { 
			System.out.print("La nota es B");
			}
		else {
			if (nota < 89 && nota >= 80) { 
				System.out.print("La nota es B");}
			else {
				if (nota < 79 && nota >= 70) { 
					System.out.print("La nota es C");}
				else {
					if (nota < 69 && nota >= 60) { 
						System.out.print("La nota es D");}
					else {
						if (nota < 59)
						System.out.print("La nota es F");
						
					}
					
					
				}
			}
			
		}
	}
	

	
	}
}
