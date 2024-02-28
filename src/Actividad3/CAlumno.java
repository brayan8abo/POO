package Actividad3;

import java.util.Arrays;
import java.util.Date;

public class CAlumno extends CAsignatura{

	public CAlumno(String nombre, String apellido1, Date nacimiento, int dNI, int sueldo, String titulo) {
		super(nombre, apellido1, nacimiento, dNI, sueldo, titulo);
		// TODO Auto-generated constructor stub
	}

	private String nombre;
	private String apellido1;
	private Date nacimiento;
	private int DNI;
	private String[] asignatura = new String[3];
	private int nota;

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

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int dNI) {
		DNI = dNI;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String[] getAsignatura() {
		return asignatura;
	}

	@Override
	public String toString() {
		return "CAlumno [Nombre= " + getNombre() + ", Apellido= " + getApellido1() + ", Nacimiento= " + getNacimiento()
				+ ", DNI= " + getDNI() + ", Nota= " + getNota() + ", Asignatura= " + Arrays.toString(getAsignatura())
				+ "]";
	}

}
