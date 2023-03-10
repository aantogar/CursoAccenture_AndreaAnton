package ejerciciosBanco;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

import javax.xml.crypto.Data;

import bancoUtils.Filtros;

public class Credito extends Tarjeta{
	private double credito;
	private  List<Movimiento> movimientosCred=new ArrayList<Movimiento>();
	private double comision=5/100;
	private double minimo=3;
	private final int MIN_INGR=0;
	
	Filtros filtros;
	
	public Credito(String numero,String titular,LocalDate fechacaduc) throws Exception {
		super(numero,titular,fechacaduc);
	}

	public double getCredito() {
		 double resultado=0.0;
		for(Movimiento mov: movimientosCred) {
			resultado+=mov.getMiimporte();
		}
		return resultado;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	public void liquidar(int mes, int anio) {
		double resultado = 0;
			for(Movimiento mov: movimientosCred) {
			if((mov.getFecha().getMonthValue() == mes && mov.getFecha().getDayOfYear()==anio)) {
				resultado += mov.getMiimporte();
				movimientosCred.remove(resultado);
				getCredito();
			}
			
		}
		
		Movimiento movDos = new Movimiento();
		movDos.setConcepto("Liquidación de importe");
		movDos.setMiimporte(resultado);
		addMovimiento(movDos);
		getCuentasoc().addMovimiento(movDos);
	}


	

	@Override
	public void pagoEstablecimiento(String concepto, double x) {
		// TODO Auto-generated method stub
		Movimiento mov=new Movimiento();
		concepto=("Pago con la tarjeta de credito: ");
		mov.setConcepto(concepto);
		mov.setMiimporte(x);
		addMovimiento(mov);
		credito-=x;
		
	}

	public void setSaldo(double x) {
		Movimiento mov = new Movimiento();
		mov.setConcepto("Saldo ingresado: ");
		mov.setMiimporte(x);
		//movimientosCred.add(mov);
		addMovimiento(mov);
	}



	@Override
	public String toString() {
		return "\n*************************************************\n\n\t\tEXTRACTO BANCARIO\n\n*************************************************"
				+"\nTitular de Crédito: "+getTitular()+"\nNº de cuenta:\t" + getNumero()+ "\nCredito disponible:\t" + getCredito() + 
				"\n\n Ha realizado los siguientes MOVIMIENTOS:\n"+getMovimientosCred()+"\n";
	}

	@Override
	public void ingresar(double x) throws Exception {
		if(Filtros.FilterIngresarCantidad(x, MIN_INGR)) {
			ingresar("Ingreso en efectivo: ",x);
			}else
			//se aplica la excepción si no se cumple el filtro.
				throw new Exception("No se ha podido ingresar la cantidad.");
	}

	@Override
	public void ingresar(String concepto, double x) throws Exception {
		Movimiento mov=new Movimiento();
		if(filtros.FilterIngresarCantidad(x, MIN_INGR)) {
			mov.setConcepto(concepto);
			mov.setMiimporte(x);
			addMovimiento(mov);
			credito+=x;
		}else
		//se aplica la excepción si no se cumple el minimo para ingresar.
			throw new Exception("No se ha podido ingresar la cantidad.");
	}
	

	@Override
	public void retirar(String concepto, double x) throws Exception {
		// TODO Auto-generated method stub
		Movimiento mov=new Movimiento();
		concepto=("Se ha retirado de la tarjeta de credito un total de ");
		if(Filtros.FilterRetirarCantidad(x, getCredito())) {
			x+=x*comision;
			mov.setConcepto(concepto);
			mov.setMiimporte(-x);
			addMovimiento(mov);
			credito-=x;
		}else
			//aplicamos la excepción si no hay saldo suficiente
			throw new Exception("No hay saldo suficiente en la cuenta para realizar la operación");		
	}
	protected void addMovimiento(Movimiento m) {
		List<Movimiento>mov=movimientosCred;
		mov.add(m);
	}

	public List<Movimiento> getMovimientosCred() {
		return movimientosCred;
	}

	public void setMovimientos(List<Movimiento> movimientosCred) {
	
		this.movimientosCred = new ArrayList<Movimiento>(movimientosCred);	
	}

	@Override
	public void retirar(double x) throws Exception  {
		if(Filtros.FilterRetirarCantidad(x, getCredito())) {
			retirar("Retirada de efectivo",x);
		}else
			throw new Exception("No se ha podido ingresar la cantidad.");	
	}
	public void mostrar() {
			System.out.println(getMovimientosCred()); 
		System.out.println("Saldo Crédito disponible: " + getCredito());
	}

}
