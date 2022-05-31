package OrientacaoObjeto;

public class Atividade4 {

	String nomeCompleto;
	String cargo;
	String departamento;
	int idade;

	public Atividade4 (String nomecompleto, String funcao, String area, int idadee) {
		nomeCompleto = nomecompleto;
		cargo = funcao;
		departamento = area;
		idade = 27;
	}

	// MÉTODOS -> COMPORTAMENTOS
	public String getFuncionarioNome() {
		String funcio = "Nome completo: " + nomeCompleto + " Cargo: " + cargo + " Departamento: " + departamento
				+ ". Idade: " + idade;
		return funcio;
	}

}
