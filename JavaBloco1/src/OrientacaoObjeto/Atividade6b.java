package OrientacaoObjeto;

import java.util.Scanner;

public class Atividade6b {

	public static void main(String[] args) {
		Atividade6 cont = new Atividade6();

		Scanner leia = new Scanner(System.in);

		cont.agencia = "Bradesco";
		cont.dono = "Gabriel";
		cont.tipoConta = true;

		System.out.print("Primeiramente, informe-nos seu saldo atual: ");
		cont.saldo = leia.nextDouble();

		cont.depositar();

		cont.sacar();

		cont.limite = cont.saldo * 0.20;

		cont.checagemDeConta();
	}

}
