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
			
			System.out.print("Seu nome é "+this.nome);
			System.out.println(" você tem "+this.idade+ " anos.");
			System.out.print("Seu gênero é " +this.sexo);
			System.out.print(" e seu estado civil é "+this.ec);
			System.out.println(", você mora na rua "+this.end+".");
			System.out.print("Telefone para contato: "+this.telefone);
			System.out.println(this.compra);
			
	}
	}
	