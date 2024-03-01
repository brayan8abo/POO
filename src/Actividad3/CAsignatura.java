package Actividad3;

import java.util.Date;

public class CAsignatura {
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

	

	public CAsignatura(int picodigo, Object poProfesor, int piHorasSemanales) {
		super();
		this.picodigo = picodigo;
		this.poProfesor = poProfesor;
		this.piHorasSemanales = piHorasSemanales;
	}

	@Override
	public String toString() {
		return "Asignatura [codigo()=" + getPicodigo() + ",Profesor()=" + getPoProfesor()
				+ ", HorasSemanales()=" + getPiHorasSemanales() + "]";
	}

}
