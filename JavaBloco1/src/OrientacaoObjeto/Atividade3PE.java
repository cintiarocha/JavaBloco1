package OrientacaoObjeto;

public class Atividade3PE {

	String fonedeOuvido = "Fone de Ouvido", modelo = "Auricular", marca = "Samsung";

	public void som() {
		System.out.println("Ouvir música/escutar....");
	}

	public void estado() {
		System.out.println("Fone de Ouvido em uso....");
	}

	public String getfone1() {
		String fone = "" + fonedeOuvido + " Modelo:" + modelo + " Marca: " + marca;
		return fone;
	}
}