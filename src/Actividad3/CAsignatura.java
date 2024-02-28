package Actividad3;

import java.util.Date;

public class CAsignatura extends CProfesor {
//	CAsignatura: piCodigo, psNombre, poProfesor, piHorasSemanales;
//	De Tipo: y h i l f u b c s o : byte, short, int, long, float, double, boolean, char, string, object
//	De Grupo: a l : array, array-list
//	De ámbito: p w i o x : propiedad, de-trabajo, argumentos de entrada, salida, entrada-salida

	private int codigo;
	private String nombre;
	private Object Profesor;
	private int horasSemanales;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Object getProfesor() {
		return Profesor;
	}
	public void setProfesor(Object profesor) {
		Profesor = profesor;
	}
	public int getHorasSemanales() {
		return horasSemanales;
	}
	public void setHorasSemanales(int horasSemanales) {
		this.horasSemanales = horasSemanales;
	}
	public CAsignatura(String nombre, String apellido1, Date nacimiento, int dNI, int sueldo, String titulo) {
		super(nombre, apellido1, nacimiento, dNI, sueldo, titulo);
		// TODO Auto-generated constructor stub
	}
	
}
