package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

public  class Movimiento extends Cuenta{
	private String concepto;
	private LocalDate fecha;
	private double miimporte;
	
	public Movimiento() {
		
		setFecha(LocalDate.now());
		
	}

	@Override
	public String toString() {
		return "Concepto:\t" + getConcepto() + "\nFecha:\t\t" + getFecha() + "\nIMPORTE:\t" + getMiimporte() + ".\n\n";
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
		
		
	}

	public double getMiimporte() {
		return miimporte;
	}

	public void setMiimporte(double miimporte) {
		this.miimporte = miimporte;
	}

}
