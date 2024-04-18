package eviden.pablo.spring.P1.Dependencias;

public class Zoo {
	Animal animal;
	
	public void setAnimal(Animal animal) {
		this.animal=animal;	
	}
	
	public void emiteSonido() {
		System.out.println("Abriendo el zoo");
		System.out.println(animal.sonido());
	}
}
