package OrientacaoObjeto;

import java.util.Scanner;

public class Atividade2Aviao {
	public static void main(String[] args) {
		
		Atividade2 aviao = new Atividade2 ();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual a velocidade do avião? ");
		aviao.velocidadeDecolar = ler.nextInt();
		
		aviao.Cor = "Branco com laranja";
		aviao.fabricante = "Airbus";
		aviao.modelo="Airbus 380";
		
		aviao.velocidade ();
		aviao.estado ();
		
	}
}
