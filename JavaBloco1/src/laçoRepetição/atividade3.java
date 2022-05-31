package laçoRepetição;

import java.util.Scanner;

public class atividade3 {
	public static void main(String[] args) {
		int x,cont=0, cont2=0;
		Scanner ler=new Scanner(System.in);
		System.out.println("escreva a idade ou se quiser finalizar o programa digite-99: ");
		x=ler.nextInt();
		while(x!=-99)
		{
			if(x<21) {
				cont++;
			}
		 else if(x>=50) {
			 cont2++;
		 }
			System.out.println("escreva a idade ou se quiser finalizar o programa digite-99: ");
			x=ler.nextInt();
		}
		System.out.println("tem "+cont+" pessoas com menos de 21 anos e tem "+cont2+" pessoas com mais de 50 anos");
		System.out.println("programa finalizado");
	}

}
