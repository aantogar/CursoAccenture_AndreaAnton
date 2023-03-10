package src.bancoAppPracticarJava;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Credito extends Tarjeta{
	private double mCredito;
	private List<Movimiento>mMovimientos=new ArrayList<Movimiento>();
	//variable para calcular la comision
	private double comision=5/100;
	private double  minimo=3;
	
	
	public Credito(String numero,String titular, LocalDate fechacaduc) {
		super(numero,titular,fechacaduc);
	}


	@Override
	public String toString() {
		return "Credito [mCredito=" + mCredito + ", mMovimientos=" + mMovimientos + ", getmCredito()=" + getmCreditoDisponible()
				+ ", getmFechaCaducidad()=" + getmFechaCaducidad() + ", getmNumero()=" + getmNumero()
				+ ", getmTitular()=" + getmTitular() + "]";
	}


	public double getmCreditoDisponible() {
		mCredito=0;
		for(Movimiento m: mMovimientos) {
			mCredito+=m.getmImporte();
		}
			
		return mCredito;
	}


	public void setmCredito(double mCredito) {
		this.mCredito = mCredito;
	}


	public List<Movimiento> getmMovimientos() {
		return mMovimientos;
	}


	public void setmMovimientos(List<Movimiento> mMovimientos) {
		this.mMovimientos = new ArrayList<Movimiento>(mMovimientos);
	}





	@Override
	public double getSaldo() {
		return super.getSaldo();
	}


	@Override
	public void ingresar(double x) throws Exception {
		//creamos nuevo movimiento
		Movimiento mov=new Movimiento();
		//nos aseguramos que la cantidad a ingresar sea mayor que 0
		if(x>0) {
			mCredito+=x;
		}//agregamos concepto e importe al nuevo movimiento
		mov.setmConcepto("Ingreso en cuenta asociada: ");
		mov.setmImporte(x);
		//añadimos a nuestro ArrayList el movimiento creado
		mMovimientos.add(mov);
		
	}


	@Override
	public void retirar(double x) {
		//creamos un nuevo movimiento
		double com_act=(x*5)/100;
		Movimiento mov=new Movimiento();
		//comprobamos que x sea mayor que el credito disponible
		if(x < getmCreditoDisponible()) {
			if(com_act < minimo) {
				x+=minimo;
			}else {
				x+=com_act;	
			}
			mov.setmConcepto("Retirada en cuenta asociada");
			mov.setmImporte(-x);
			mMovimientos.add(mov);
			mCredito-=x;	
	}else {
		System.out.println("No se ha podido retirar el dinero");
	}
	}


	@Override
	public void pagoEnEstablecimiento(String datos, double x) {
		Movimiento mov=new Movimiento();
		datos="Compra a crédito en: ";
		mov.setmConcepto(datos);
		mov.setmImporte(-x);
		mMovimientos.add(mov);
		mCredito-=x;
	}

}
