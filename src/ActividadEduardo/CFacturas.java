package ActividadEduardo;

import java.util.Date;

public class CFacturas {
	private int numeroFactura;
	private Date fechaFactura;
	private int numeroCliente;
	private double importe;
	private double IVA;

	public CFacturas(int numeroFactura, Date fechaFactura, int numeroCliente, double importe, double iVA) {
		super();
		this.numeroFactura = numeroFactura;
		this.fechaFactura = fechaFactura;
		this.numeroCliente = numeroCliente;
		this.importe = importe;
		IVA = iVA;
	}

	public CFacturas() {
		super();
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public Date getFechaFactura() {
		return fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getIVA() {
		return IVA;
	}

	public void setIVA(double iVA) {
		IVA = iVA;
	}

	@Override
	public String toString() {
		return "CFacturas [getNumeroFactura()=" + getNumeroFactura() + ", getFechaFactura()=" + getFechaFactura()
				+ ", getNumeroCliente()=" + getNumeroCliente() + ", getImporte()=" + getImporte() + ", getIVA()="
				+ getIVA() + "]";
	}

}
