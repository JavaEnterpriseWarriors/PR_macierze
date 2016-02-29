package openmpi.comando;

public class XorArteGuera implements ComandoArteGuera {

	@Override
	public Integer computar(Integer primeroElemento, Integer segundoElemento) {
		boolean primero = 1==primeroElemento;
		boolean segundo = 1==segundoElemento;
		return primero ^ segundo? 1 : 0 ;
	}

}
