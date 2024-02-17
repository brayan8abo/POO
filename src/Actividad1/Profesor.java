package Actividad1;

public class Profesor {

    private String nombre;
    private int edad;
    private int añosConsolidados;
	
    
    public Profesor(String nombre, int edad, int añosConsolidados) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.añosConsolidados = añosConsolidados;
	}
    
    public double obtenerSalarioBase() {
        return 1100 + (this.añosConsolidados * 50);
    }
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAñosConsolidados() {
		return añosConsolidados;
	}
	public void setAñosConsolidados(int añosConsolidados) {
		this.añosConsolidados = añosConsolidados;
	}

	@Override
	public String toString() {
		return "Profesor [obtenerSalarioBase= " + obtenerSalarioBase() + ", Nombre= " + getNombre()
				+ ", Edad= " + getEdad() + ", AñosConsolidados= " + getAñosConsolidados() + "]";
	}
	
}
