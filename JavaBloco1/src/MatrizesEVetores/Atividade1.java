package MatrizesEVetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet [] = new int [5];
		Scanner ler = new Scanner (System.in);
		
		for (int x=0 ; x<5 ; x++) {
			System.out.println("Digite um número: ");
			vet[x]= ler.nextInt();
			
		}
			 
			for (int x=0; x<5; x++) {
				System.out.print(vet[x] +"\t" );

			}
			
			
		}

	}


