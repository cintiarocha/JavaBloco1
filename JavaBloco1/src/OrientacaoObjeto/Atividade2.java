package OrientacaoObjeto;

public class Atividade2 {
	//ATRIBUTOS AVIAO
	String fabricante;
	String modelo;
	String Cor;
	int velocidadeDecolar;
	
	// METODOS
	public void velocidade ( )
	{
		if (velocidadeDecolar == 280)
			System.out.println("O avião está pronto pra decolar!");
		if (velocidadeDecolar < 280) 
		
			System.out.println("O avião não está pronto para decolar!");
			
	}
		public void estado () {
		
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.Cor);
		
		
	}
	
}
	