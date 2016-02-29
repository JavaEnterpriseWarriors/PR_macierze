package openmpi.achatamiento;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

public class ElementoAchatamiento {
	private ElementoAchatamiento(){}
	
	public <T extends Serializable> String codificado(T objecto) throws IOException {
		ByteArrayOutputStream bos = null;
		ObjectOutput out = null;
		byte[] contento;
		try {
			bos = new ByteArrayOutputStream();
			out = new ObjectOutputStream(bos);
			out.writeObject(objecto);
			contento = bos.toByteArray();
		} finally {
			if (out != null) {
				out.close();
			}
		}
		return Base64.getEncoder().encodeToString(contento);
	}

	public <T extends Serializable> T descifrado(String objecto, Class<T> especjes) throws IOException, ClassNotFoundException {
		byte[] contento = Base64.getDecoder().decode(objecto);
		
		ByteArrayInputStream bis = new ByteArrayInputStream(contento);
		ObjectInput in = null;
		Object respuesta = null; 
		try{
			in = new ObjectInputStream(bis);
			respuesta = in.readObject();
		}finally{
			if(in!=null){
				in.close();
			}
		}
		
		return especjes.cast(respuesta);
	}
}
