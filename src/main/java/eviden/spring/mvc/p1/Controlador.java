package eviden.spring.mvc.p1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {
	
	@RequestMapping
	public String muestraPagina() {	
		return "paginaEjemplo";
	}
}
