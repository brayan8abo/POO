package Actividad3;

import java.util.Date;

public class CProfesor {
//	CProfesor: psNombre, psApellido1, pdNacimiento, piDni, piSueldo, psTitulo;
//	De Tipo: y h i l f u b c s o : byte, short, int, long, float, double, boolean, char, string, object
//	De Grupo: a l : array, array-list
//	De ámbito: p w i o x : propiedad, de-trabajo, argumentos de entrada, salida, entrada-salida

	private String nombre;
	private String apellido1;
	private Date nacimiento;
	private int dni;
	private int sueldo;
	private String titulo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setDNI(int dNI) {
		dni = dni;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public CProfesor(String nombre, String apellido1, Date nacimiento, int dNI, int sueldo, String titulo) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.nacimiento = nacimiento;
		dNI = dni;
		this.sueldo = sueldo;
		this.titulo = titulo;
	}

}
