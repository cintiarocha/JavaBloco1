package Repeticao;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[] args) {
	
		int n1;
		Scanner ler = new Scanner (System.in);
		
			System.out.println("Digite sua idade: ");
			n1 = ler.nextInt();
			
			while (n1<=1) {
			System.out.println("Sua idade � ");
			
				if (n1>50) {
					System.out.println("O total de pessoas com a idade maior ou igual � 50 �: ");
				
				
				}
				else
					System.out.println("Digite sua idade: ");
				n1 = ler.nextInt();
				
		}
	}	

}	
	


