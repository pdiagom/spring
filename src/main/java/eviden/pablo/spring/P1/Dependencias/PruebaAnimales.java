package eviden.pablo.spring.P1.Dependencias;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PruebaAnimales 
{
    public static void main( String[] args )
    {
    	//Prueba sin uso de Beans
//       Animal perro= new Perro();
//       Animal gato=new Gato();
//       
//       System.out.println(perro.sonido());
//       System.out.println(gato.sonido());
    	
    	//Prueba con beans
//    	@SuppressWarnings("resource")
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
       
//    	BeanFactory factory=context;
    	
//    	Zoo zoo=(Zoo) factory.getBean("emiteSonido");
//    	zoo.emiteSonido();
    	
    	//Prueba con Java Annotations
    	ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    
    	Animal paco = context.getBean("lobo",Animal.class);
    	
    	System.out.println(paco.sonido());
    	
    	context.close();
    }
}
