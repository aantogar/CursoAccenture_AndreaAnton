package src.bancoAppPracticarJava;

import java.time.LocalDate;

public  class Movimiento {
	@Override
	public String toString() {
		return "Movimiento [mConcepto=" + mConcepto + ", mFecha=" + mFecha + ", mImporte=" + mImporte
				+ ", getmConcepto()=" + getmConcepto() + ", getmFecha()=" + getmFecha() + ", getmImporte()="
				+ getmImporte() + "]";
	}


	//declaramos sus atributos
	private String mConcepto;
	private LocalDate mFecha;
	private double mImporte;
	
	
	public Movimiento() {
		
	}


	public String getmConcepto() {
		return mConcepto;
	}


	public void setmConcepto(String mConcepto) {
		this.mConcepto = mConcepto;
	}


	public LocalDate getmFecha() {
		return mFecha;
	}


	public void setmFecha(LocalDate mFecha) {
		this.mFecha = mFecha;
	}


	public double getmImporte() {
		return mImporte;
	}


	public void setmImporte(double mImporte) {
		this.mImporte = mImporte;
	}
	

}
