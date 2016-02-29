package openmpi.creador;

import java.util.ArrayList;
import java.util.List;

import openmpi.transporteObjecto.RespuestaElemento;

public class ResultadoCreador {
	private final List<RespuestaElemento> elementos;
	
	public ResultadoCreador() {
		elementos = new ArrayList<RespuestaElemento>();
	}
	
	public void addRespuestaElemento(RespuestaElemento elemento){
		if(elemento != null){
			elementos.add(elemento);
		}
	}
	
	public Integer[][] desarrollar(){
		Integer[][] resultado = new Integer[elementos.size()][];
		
		for(RespuestaElemento elemento : elementos){
			resultado[elemento.getLineaNumero()] = elemento.getRespuestaLinea();
		}
		
		return resultado;
	}
}
