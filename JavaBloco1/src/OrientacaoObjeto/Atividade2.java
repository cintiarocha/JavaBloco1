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
			System.out.println("O avi�o est� pronto pra decolar!");
		if (velocidadeDecolar < 280) 
		
			System.out.println("O avi�o n�o est� pronto para decolar!");
			
	}
		public void estado () {
		
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Modelo: "+this.modelo);
		System.out.println("Cor: "+this.Cor);
		
		
	}
	
}
	