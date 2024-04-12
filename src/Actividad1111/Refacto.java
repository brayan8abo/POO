package Actividad1111;

import java.util.ArrayList;

public class Refacto {
	public static void main(String[] args) {
//		¿Qué es la refactorización?

//		Es una técnica basada en realizar transformaciones en el código 
//		para mejorar la estructura y hacerlo más legible, eficiente sin la necesidad
//		de cambiar su comportamiento

		System.out.println("¿Cuando hacerlo?");

		for (int i = 0; i < args.length; i++) {
			System.out.println("Los principales sintomas para refactorizar un código"
					+ " son los llamados bad smells [MALOS OLORES]");
			if (i == 0) {
				System.out.println(
						"Cuando hay código duplicado, métodos largos, clases grades, lista de parametros extensa,"
								+ "cambio divergente, envidia de funcionalidad, clase de datos, legado rechazado");

			}

		}

		ArrayList<String> palabras = new ArrayList<>();

		for (String string : palabras) {
			System.out.println("---LA DOCUMENTACIÓN");

			String palabra = "Palabra";
			if (palabra == "Palabra") {

				System.out.println("La documentación de código es un istrumento del proceso de desarrollo de software"
						+ " que describe y explica el funcionamiento del mismo");

//				for (int i = 0; i < palabras.size(); i++) {
//					
//					int documentacionDeLasEspeficifaciones;
//					
//					int documentacionDeDiseño;
//					
//					int yTambiénDeCódigoFuente;
//					
//					int yPorParteDeusuarioFinal;
//					
//				}
			}

		}

		for (int i = 0; i < args.length; i++) {
//			
//			@author seria el autor de la clase
//			@version version de la clase
//			@see referencia a otra clase/metodo
//			@param descripcion del parametro, en metodos una por parametro inicial del metodo
//			@returns descripcion de lo que devuelve si no es void
//			@throws descripcion de la excepcion que pueda propagar una etiqueta por cada tipo de excepcion

		}
		for (int i = 0; i < args.length; i++) {
			System.out.println("Para hacer una rama Git Branch y nombre de la rama");
			System.out.println("git checkout para pasar a la rama y luego hacemos los cambios");
			System.out.println("Para hacer el merge nos pasamos a la rama donde queramos "
					+ "la fusion y hacemos un git merge [nombre rama donde estan las cosas] nombre rama donde queremos las cosas, en este caso a donde nos movimos anteriormente");
			System.out.println("Para eliminar una rama git branch -d [nombre de la rama]");
		}
	}

}
