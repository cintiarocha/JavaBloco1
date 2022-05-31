package laçoRepetição;

import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
		int num, media=0,soma=0,cont=0,i;
		Scanner ler=new Scanner(System.in);
		do {
			System.out.println("digite um numero:");
			num=ler.nextInt();
			if(num%3==0 && num!=0) {
				soma=soma+num;
				cont++;
				}
				}while(num!=0);{
		System.out.println("digite um numero:");
		num=ler.nextInt();
		if(num%3==0 && num!=0) {
			soma=soma+num;
			cont++;	}
		media=soma/cont;
		
		System.out.println("a média dos numeros são:"+media);
		}
	

}

}
