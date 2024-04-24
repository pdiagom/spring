package eviden.pablo.spring.P1.Dependencias;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Perro implements Animal {

	@Override
	public String sonido() {
		// TODO Auto-generated method stub
		return ladrido.getSonidoAlto();
	}

	@Autowired
	@Qualifier("ladridoAlto")
	private SonidoAlto ladrido;
}
