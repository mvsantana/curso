package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) throws Exception{
		
		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());;
		}
		
			geraErro2();
			System.out.println("");
	
	}
	//Não checada ou não verifica
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!");

	}

	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}

}
