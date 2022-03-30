package excecao.personalizaB;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception{
	
	private String nomeDoAtributo;
	
	public NumeroForaIntervaloException(String nomeDoAtributo) {
		this.nomeDoAtributo = nomeDoAtributo;
	}
	

	public String getMessage() {

		return String.format("O aluno está nulo",
				nomeDoAtributo);
	}

}
