package laçoRepetição;

import java.util.Scanner;

public class atividade4 {
	public static void main(String[] args) {
		int idade,sexo,pessoa,x,cont1=0,cont2=0,cont3=0,cont4=0,cont5=0,cont6=0;
		Scanner ler=new Scanner(System.in);
		System.out.println("pessoa numero:" );
		x=ler.nextInt();
		System.out.println("digite sua idade" );
		idade=ler.nextInt();
		System.out.println("digite seu sexo, se for feminino digite 1, se for masculino digite 2, ser for outro digite 3: ");
		sexo=ler.nextInt();
		System.out.println("sobre você, digite 1 se você é calmo, digite 2 se você é uma pessoa nervosa, digite 3 se você é uma pessoa agressiva:");
		pessoa=ler.nextInt();
		while(x<150) {
			if(pessoa==1) {
				cont1++;
			}
			 else if(sexo==1 && pessoa==2) {
				cont2++;
			}
			 else if(sexo==2 && pessoa==3) {
				 cont3++;
			 }
			 else if(sexo==3 && pessoa==1) {
				 cont4++;
			 }
			 else if(idade>40 && pessoa==2) {
				 cont5++;
			 }
			 else if(idade<18 && pessoa==1) {
				 cont6++;
			 }
			System.out.println("pessoa numero:" );
			x=ler.nextInt();
			System.out.println("digite sua idade" );
			idade=ler.nextInt();
			System.out.println("digite seu sexo, se for feminino digite 1, se for masculino digite 2, ser for outro digite 3: ");
			sexo=ler.nextInt();
			System.out.println("sobre você, digite 1 se você é calmo, digite 2 se você é uma pessoa nervosa, digite 3 se você é uma pessoa agressiva:");
			pessoa=ler.nextInt();
		}
		System.out.println("o numero de pessoas calmas é "+cont1);
		System.out.println("o numero de mulheres nervosas é "+cont2);
		System.out.println("o numero de homens agressivos é "+cont3);
		System.out.println("o numero de outros calmos é  "+cont4);
		System.out.println("o numero de pessoas com mais de 40 anos nervosas é "+cont5);
		System.out.println("o numero de pessoas com menos de 18 anos e calmas é "+cont6);
		System.out.println("PROGRAMA FINALIZADO!");
}

}
