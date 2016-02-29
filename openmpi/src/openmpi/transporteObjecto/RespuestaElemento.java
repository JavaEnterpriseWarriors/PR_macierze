package openmpi.transporteObjecto;

import java.io.Serializable;

public class RespuestaElemento implements Serializable {
	private static final long serialVersionUID = -1679614356518921528L;
	private Integer[] respuestaLinea;
	private Integer lineaNumero;
	
	public RespuestaElemento() {}

	public RespuestaElemento(Integer[] respuestaLinea, Integer lineaNumero) {
		super();
		this.respuestaLinea = respuestaLinea;
		this.lineaNumero = lineaNumero;
	}

	public Integer[] getRespuestaLinea() {
		return respuestaLinea;
	}

	public void setRespuestaLinea(Integer[] respuestaLinea) {
		this.respuestaLinea = respuestaLinea;
	}

	public Integer getLineaNumero() {
		return lineaNumero;
	}

	public void setLineaNumero(Integer lineaNumero) {
		this.lineaNumero = lineaNumero;
	}
	
}
