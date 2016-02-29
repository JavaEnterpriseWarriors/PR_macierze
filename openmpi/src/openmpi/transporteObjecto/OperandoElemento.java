package openmpi.transporteObjecto;

import java.io.Serializable;

public class OperandoElemento implements Serializable {
	private static final long serialVersionUID = 2463211738322625459L;
	private Integer[] primeroLinea;
	private Integer[] segundoLinea;
	private String comando;
	private Integer lineaNumero;
	
	public OperandoElemento() {}

	public OperandoElemento(Integer[] primeroLinea, Integer[] segundoLinea,
			String comando, Integer lineaNumero) {
		super();
		this.primeroLinea = primeroLinea;
		this.segundoLinea = segundoLinea;
		this.comando = comando;
		this.lineaNumero = lineaNumero;
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

	public String getComando() {
		return comando;
	}

	public void setComando(String comando) {
		this.comando = comando;
	}

	public Integer getLineaNumero() {
		return lineaNumero;
	}

	public void setLineaNumero(Integer lineaNumero) {
		this.lineaNumero = lineaNumero;
	}

}
