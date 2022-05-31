package laçoRepetição;

import java.util.Scanner;

public class atividade2 {
	public static void main(String[] args) {
		int x,i,par=0,impar=0;
		Scanner ler=new Scanner(System.in);
	
		for(i=1;i<=10;i++) {
			System.out.println("escreva um numero: ");
		    x=ler.nextInt();
		
		  if(x%2==0) {
			  par++;
			 
		  }
		  else {
			impar++;
		  }
		 
		  }
		System.out.println("temos "+par+" numeros pares e "+impar+" impares.");
		System.out.println("fim do programa:)");
	}

}
