package Introdução;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in); 
		
		int n1;
		System.out.println("Qual a sua idade ? ");
		n1 = ler.nextInt();
		
		if ( n1>=10 && n1<=14) {
			System.out.println("Categória Infantil");
				}
		if ( n1>=15 && n1<=17 ) {
			System.out.println("Categoria Juvenil");
		}
		else {
			System.out.println("");
		}
	}
}