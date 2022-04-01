package Introdução;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n, d;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		d = n / 2;
		
		if (d == 0) {
			System.out.println("Seu número é par e raíz quadrada dele é: " + (n * 2));
		}
		else {
			
			System.out.println("O seu número é impar e elevado ao quadrado ele fica: " + (n*n));
		}
		
				
		

		 
		
	}

}
