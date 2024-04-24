package eviden.pablo.spring.P1.Dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Gato implements Animal {

	//Inyeccion con constructor
//	@Autowired
//	public Gato(SonidoAlto maullido) {
//		this.maullido = maullido;
//	}
	
	//Inyeccion con setter
//	@Autowired
//	public void setMaullido(SonidoAlto maullido) {
//		this.maullido = maullido;
//	}



	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return maullido.getSonidoAlto();
	}
	
	//Inyeccion con campo de clase
	@Autowired
	@Qualifier("maullidoAlto")
	private SonidoAlto maullido;
}
