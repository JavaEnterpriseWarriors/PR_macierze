package openmpi.executorro;

import openmpi.comando.ComandoEjemplo;
import openmpi.transporteObjecto.RespuestaElemento;

public class ComandoExecutorro {
	private ComandoEjemplo ejemplo;
	private int lineaNumero;
	
	public ComandoExecutorro(ComandoEjemplo ejemplo, int lineaNumero) {
		super();
		this.ejemplo = ejemplo;
		this.lineaNumero = lineaNumero;
	}

	public RespuestaElemento otorgar(){
		Integer[] respuestaLinea = new Integer[ejemplo.getPrimeroLinea().length];
		
		for(int i = 0; i < ejemplo.getPrimeroLinea().length; i++){
			respuestaLinea[i] = ejemplo.computar(ejemplo.getPrimeroLinea()[i], ejemplo.getSegundoLinea()[i]);
		}
		
		return new RespuestaElemento(respuestaLinea, lineaNumero);
	}
}


