package OrientacaoObjeto;

public class Atividade1 {
	// ATRIBUTOS DO CLIENTE
	String nome;
	int idade;
	String sexo;
	String ec;
	String end;
	long telefone;
	boolean compra;
	
	//METODO
	public void escrever ()
	{
		if (compra == true) 
			System.out.println("Obrigado pela compra. Volte Sempre!");
			else 
			System.out.println("Volte sempre!");
	}
		
		public void compra ()
		{
			this.compra=true;
		}	
		public void compra1 ()
		{
			this.compra=false;
		}
		public void estado ()
		{
			
			System.out.print("Seu nome � "+this.nome);
			System.out.println(" voc� tem "+this.idade+ " anos.");
			System.out.print("Seu g�nero � " +this.sexo);
			System.out.print(" e seu estado civil � "+this.ec);
			System.out.println(", voc� mora na rua "+this.end+".");
			System.out.print("Telefone para contato: "+this.telefone);
			System.out.println(this.compra);
			
	}
	}
	