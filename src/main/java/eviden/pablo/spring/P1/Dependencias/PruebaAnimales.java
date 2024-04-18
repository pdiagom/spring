package eviden.pablo.spring.P1.Dependencias;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaAnimales 
{
    public static void main( String[] args )
    {
//       Animal perro= new Perro();
//       Animal gato=new Gato();
//       
//       System.out.println(perro.sonido());
//       System.out.println(gato.sonido());
    	
    	@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       
    	BeanFactory factory=context;
    	
    	Zoo zoo=(Zoo) factory.getBean("emiteSonido");
    	zoo.emiteSonido();
    }
}
