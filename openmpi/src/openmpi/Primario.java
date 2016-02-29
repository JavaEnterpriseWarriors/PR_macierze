package openmpi;

import java.util.List;

import com.google.gson.Gson;

import mpi.*;

public class Primario {

	public static void main(String[] args) throws MPIException {
		Parameters parameters;
		if(args!= null && args.length > 0){
			parameters = parseArgumentsJSON(args[0]);
			if(parameters == null){
				System.out.println("Brak parametrów wyjściowych!!");
				System.exit(-1);
			}
		}
		
		MPI.Init(args);
		
//		MPI.COMM_WORLD.se
		
		int myrank = MPI.COMM_WORLD.getRank();
		int size = MPI.COMM_WORLD.getSize() ;
		
		System.out.println("Hello world from rank " + myrank + " of " + size);
	 
		MPI.Finalize();
	}
	
	private static Parameters parseArgumentsJSON(String arg){
		return new Gson().fromJson(arg, Parameters.class);
	}
	
	class Parameters{
		private List<Integer[][]> matrices;
		private List<String> operations;
		
		public Parameters() {}

		public Parameters(List<Integer[][]> matrices, List<String> operations) {
			super();
			this.matrices = matrices;
			this.operations = operations;
		}

		public List<Integer[][]> getMatrices() {
			return matrices;
		}

		public void setMatrices(List<Integer[][]> matrices) {
			this.matrices = matrices;
		}

		public List<String> getOperations() {
			return operations;
		}

		public void setOperations(List<String> operations) {
			this.operations = operations;
		}
	}

}
