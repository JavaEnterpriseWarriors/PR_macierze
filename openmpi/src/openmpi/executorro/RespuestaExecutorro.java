package openmpi.executorro;

import mpi.*;

public class RespuestaExecutorro {
	public void send(String message){
		MPI.COMM_WORLD.send(message, message.length(), MPI.CHAR, , arg4);
	}
}
