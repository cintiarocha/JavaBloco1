package Repeticao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {

		int n1;
		Scanner ler = new Scanner (System.in);
		
		do
		{
			System.out.println("Digite Qualquer número do seu teclado: ");
			n1 = ler.nextInt();
		}
		
		
		
	while (n1 != 0 );
		System.out.println("A soma destes numeros são:  " + (n1+n1));
		
				
	}

}
