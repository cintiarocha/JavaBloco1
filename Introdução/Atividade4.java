package Introdu��o;

import java.util.Scanner;

public class Atividade4 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int n, d;
		
		System.out.println("Digite um n�mero: ");
		n = leia.nextInt();
		d = n / 2;
		
		if (d == 0) {
			System.out.println("Seu n�mero � par e ra�z quadrada dele �: " + (n * 2));
		}
		else {
			
			System.out.println("O seu n�mero � impar e elevado ao quadrado ele fica: " + (n*n));
		}
		
				
		

		 
		
	}

}
