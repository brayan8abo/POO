package poo1;

public class mainPersona {

	public static void main(String[] args) {

		Persona p1 = new Persona("Brayan", "Botero", 11);
		Persona p2 = new Persona("Sara", "Londoño", 03);

		System.out.println(p1);
		System.out.println(p2);

		Informatico p3 = new Informatico("Noel", "Dominguez", 0125, "Java");

		System.out.println(p3);

		AlumnoInformatico p4 = new AlumnoInformatico("Javier", "Fernandez", 41, "PROFESOR", "CCC");

		System.out.println(p4);

		ProfesorInformatico p5 = new ProfesorInformatico("Edu", "Salas", 411, "Programación", "EDD");

		System.out.println(p5);
		
		
		System.out.println("-------------------------------------------------------------------------------");

		Persona[] personas = new Persona[5];

		personas[0] = p1;
		personas[1] = p2;
		personas[2] = p3;
		personas[3] = p4;
		personas[4] = p5;
		
		for (Persona persona : personas) {
			System.out.println(persona);
			
		}

	}

}
