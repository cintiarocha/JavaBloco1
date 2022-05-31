package MatrizesEVetores;

import java.util.Scanner;

public class Atividade2 {
	
	public static void main(String[] args) {
		
		int vet [] = new int [10];
		try (Scanner ler = new Scanner (System.in)) {
			for (int x=0; x<10; x++) {
				System.out.println("Digite o valor do dado: ");
				vet[x] = ler.nextInt ();
			}
		}
		
		for (int x=0; x<10; x++) {
			System.out.println(vet [x]);
		}
			}

}
