package eviden.pablo.spring.P1.Dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Lobo implements Animal {

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return aullido.getSonidoAlto();
	}
	
	@Autowired
	@Qualifier("aullidoAlto")
	private SonidoAlto aullido;
}
