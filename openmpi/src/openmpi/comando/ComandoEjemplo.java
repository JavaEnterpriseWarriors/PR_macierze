package openmpi.comando;

public class ComandoEjemplo {
	private Integer[] primeroLinea;
	private Integer[] segundoLinea;
	private ComandoArteGuera comando;
	
	public ComandoEjemplo() {}

	public ComandoEjemplo(Integer[] primeroLinea, Integer[] segundoLinea,
			ComandoArteGuera comando) {
		super();
		this.primeroLinea = primeroLinea;
		this.segundoLinea = segundoLinea;
		this.comando = comando;
	}

	public Integer computar(Integer primeroElemento, Integer segundoElemento){
		return comando.computar(primeroElemento, segundoElemento);
	}
	
	public Integer[] getPrimeroLinea() {
		return primeroLinea;
	}

	public void setPrimeroLinea(Integer[] primeroLinea) {
		this.primeroLinea = primeroLinea;
	}

	public Integer[] getSegundoLinea() {
		return segundoLinea;
	}

	public void setSegundoLinea(Integer[] segundoLinea) {
		this.segundoLinea = segundoLinea;
	}

	public ComandoArteGuera getComando() {
		return comando;
	}

	public void setComando(ComandoArteGuera comando) {
		this.comando = comando;
	}
}
