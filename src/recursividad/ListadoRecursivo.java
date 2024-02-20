package recursividad;

import java.io.File;


public class ListadoRecursivo {
	public static void main(String[] args) {
		
		File directorio = new File("C:\\Users\\ALUMNO CCC - TARDE\\dir1");
		listarDirectorio(directorio);		
		
		
		
	}
	public static void listarDirectorio(File directorio) {
		 File [] ficheros = directorio.listFiles();
		 
		 if (ficheros != null) {
			 for (File file : ficheros) {
				 	if (file.isDirectory()) {
				 		System.out.println("Directorio: " + file.getAbsolutePath());
						listarDirectorio(file);
					}else {
						System.out.println("Fichero: " + file.getAbsolutePath());
					}
				
			}
			
		}
	}

}
