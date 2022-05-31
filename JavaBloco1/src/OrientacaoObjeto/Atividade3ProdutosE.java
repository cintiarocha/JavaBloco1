package OrientacaoObjeto;

public class Atividade3ProdutosE {

	String tipo;
	String cor;
	int anoF;
	String marca;
	boolean estado;
	
	void tipo2()
	{
		if (estado == true)
			System.out.println("Faça uma ligação!");
		
		if (estado == false)
			System.out.println("Compre um celular novo!");
	
	}
	void estado ()
	{
		System.out.println("Qual a marca do seu celular?  "+this.marca);
		System.out.println("Qual o sistema operacional do seu celular? "+this.tipo);
		System.out.println("Qual o ano de fabricação do seu celular? "+this.anoF);
		System.out.println("Qual a cor do seu celular? "+this.cor);
		
	
	}
	
	
}
