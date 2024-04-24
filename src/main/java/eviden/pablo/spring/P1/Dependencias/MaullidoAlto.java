package eviden.pablo.spring.P1.Dependencias;

import org.springframework.stereotype.Component;

@Component
public class MaullidoAlto implements SonidoAlto {

	@Override
	public String getSonidoAlto() {
		// TODO Auto-generated method stub
		return "MIAUUUU";
	}

}
