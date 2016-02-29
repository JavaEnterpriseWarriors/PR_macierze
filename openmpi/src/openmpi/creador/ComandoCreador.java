package openmpi.creador;

import openmpi.comando.AndArteGuera;
import openmpi.comando.ComandoEjemplo;
import openmpi.comando.OrArteGuera;
import openmpi.comando.XorArteGuera;
import openmpi.transporteObjecto.OperandoElemento;

public class ComandoCreador {
	private ComandoCreador() {
	}

	public static ComandoEjemplo regenerando(OperandoElemento elemento) {
		ComandoEjemplo comando = new ComandoEjemplo();
		comando.setPrimeroLinea(elemento.getPrimeroLinea());
		comando.setSegundoLinea(elemento.getSegundoLinea());

		switch (elemento.getComando()) {
		case AND_COMANDO:
			comando.setComando(new AndArteGuera());
			break;

		case OR_COMANDO:
			comando.setComando(new OrArteGuera());
			break;

		case XOR_COMANDO:
			comando.setComando(new XorArteGuera());
			break;
		}
		
		return comando;
	}

	private static final String AND_COMANDO = "and";
	private static final String OR_COMANDO = "or";
	private static final String XOR_COMANDO = "xor";
}
