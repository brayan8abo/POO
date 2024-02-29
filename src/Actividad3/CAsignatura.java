package Actividad3;

import java.util.Date;

public class CAsignatura extends CProfesor {
//	CAsignatura: piCodigo, psNombre, poProfesor, piHorasSemanales;
//	De Tipo: y h i l f u b c s o : byte, short, int, long, float, double, boolean, char, string, object
//	De Grupo: a l : array, array-list
//	De ámbito: p w i o x : propiedad, de-trabajo, argumentos de entrada, salida, entrada-salida

	private int picodigo;
	private Object poProfesor;
	private int piHorasSemanales;
	public int getPicodigo() {
		return picodigo;
	}
	public void setPicodigo(int picodigo) {
		this.picodigo = picodigo;
	}
	public Object getPoProfesor() {
		return poProfesor;
	}
	public void setPoProfesor(Object poProfesor) {
		this.poProfesor = poProfesor;
	}
	public int getPiHorasSemanales() {
		return piHorasSemanales;
	}
	public void setPiHorasSemanales(int piHorasSemanales) {
		this.piHorasSemanales = piHorasSemanales;
	}
	
	
	
	
	public CAsignatura(String psNombre, String psApellido1, int dia, int mes, int año, int piDni, int piSueldo,
			String psTitulo, int picodigo, Object poProfesor, int piHorasSemanales) {
		super(psNombre, psApellido1, dia, mes, año, piDni, piSueldo, psTitulo);
		this.picodigo = picodigo;
		this.poProfesor = poProfesor;
		this.piHorasSemanales = piHorasSemanales;
	}
	@Override
	public String toString() {
		return "CAsignatura [getPicodigo()=" + getPicodigo() + ", getPoProfesor()=" + getPoProfesor()
				+ ", getPiHorasSemanales()=" + getPiHorasSemanales() + ", getPiSueldo()=" + getPiSueldo()
				+ ", getPsTitulo()=" + getPsTitulo() + ", getPsNombre()=" + getPsNombre() + ", getPsApellido1()="
				+ getPsApellido1() + ", getPdNacimiento()=" + getPdNacimiento() + ", getPiDni()=" + getPiDni() + "]";
	}
	
	
	
	
}
