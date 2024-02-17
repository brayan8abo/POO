package Actividad1;

import java.time.LocalDate;

public class Productos {

	private LocalDate fechaCaducidad;
		private int numeroLote;
		
		
		public Productos(LocalDate fechaCaducidad, int numeroLote) {
			this.fechaCaducidad = fechaCaducidad;
			this.numeroLote = numeroLote;
		}
		public LocalDate getFechaCaducidad() {
			return fechaCaducidad;
		}
		public void setFechaCaducidad(LocalDate fechaCaducidad) {
			this.fechaCaducidad = fechaCaducidad;
		}
		public int getNumeroLote() {
			return numeroLote;
		}
		public void setNumeroLote(int numeroLote) {
			this.numeroLote = numeroLote;
		}
		@Override
		public String toString() {
			return "Productos [FechaCaducidad= " + getFechaCaducidad() + ", NumeroLote= " + getNumeroLote()
					+ "]";
		}

}
