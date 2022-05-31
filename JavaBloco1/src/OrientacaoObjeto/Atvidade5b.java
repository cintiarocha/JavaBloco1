package OrientacaoObjeto;

public class Atvidade5b {
	String tipo = "meio de transporte. ";
	String guidao = "";
	int rodas = 2;

	public void funcao() {
		System.out.println("Andando com minha dona......");
	}

	public void estado() {
		System.out.println("Em uso......");
	}

	public String getmeuPatinete() {
		String patin = "Patinete: " + tipo + " Guidão: se eleva até a altura da cintura" + guidao
				+ " Quantidade de rodas: " + rodas;
		return patin;
	}
}


