package openmpi.creador;

import java.util.ArrayList;
import java.util.List;

import openmpi.transporteObjecto.OperandoElemento;

public class OperandoFabrica {
	private OperandoFabrica(){}
	
	public static List<OperandoElemento> regenerado(Integer[][] primeroMatriz, Integer[][] segundoMatriz, String comando){
		List<OperandoElemento> resultado = new ArrayList<OperandoElemento>();
		
		for(int i=0;i<primeroMatriz.length;i++){
			OperandoElemento elemento = new OperandoElemento(primeroMatriz[i], segundoMatriz[i], comando, i);
			resultado.add(elemento);
		}
		
		return resultado;
	}
	
}
