package Actividad1;

public class ProfesoresMain {
	public static void main(String[] args) {

		Profesor profesor1 = new Profesor("Javier", 50, 10);
		ProfesorEmerito profesor2 = new ProfesorEmerito("Fernando", 60, 40, 10);

		Profesor[] profesor = { profesor1 };
		ProfesorEmerito[] profesorE = { profesor2 };

		
		for (Profesor profesorSencillo : profesor) {
			System.out.println(profesorSencillo);
		}
		
		
		
		for (ProfesorEmerito profesorEmerito : profesorE) {
			System.out.println(profesorEmerito);
		}

	}

}
