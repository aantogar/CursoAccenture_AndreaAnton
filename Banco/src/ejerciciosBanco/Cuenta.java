package ejerciciosBanco;

import java.util.ArrayList;

import bancoUtils.Filtros;
import java.util.Collection;
import java.util.List;

public  class Cuenta {

	private final int MIN_NAME=15;
	private final int MAX_NAME=30;
	private final int MIN_CON=10;
	private final int MAX_CON=40;
	private final int MIN_INGRESAR=0;
	
	Filtros filtros;
	
	
	private String titular;
	private String numero;
	private  List<Movimiento> movimientos=new ArrayList<Movimiento>();
	
	
	
	public Cuenta(String numero,String titular)throws  Exception {
		//aplicamos los filtros para crear el atributo titular
		    if(filtros.Filtername(titular, MIN_NAME, MAX_NAME)) {
			this.titular=titular;
			this.numero=numero;
		    }else
		    	throw new Exception("No cumple con los requisitos.");
			//Aplicamos la excepción si no se cumple el filtro.
				
		
	}
	public Cuenta() {
		
	}

	public  double getSaldo()  {
		//Recorremos con un foreach para recuperar el importe
		double r=0.0;
		/*for(Movimiento m: movimientos) {
			r+=m.getMiimporte();
			}
		return r;	*/
		
		//Manera de hacerlo con Stream
		 r=movimientos.stream()
				.map(mov->mov.getMiimporte())
				.reduce(0d, (subtotal,element)->subtotal+ element);
		 return r;
	}
	public void setSaldo(double x) {
		//inicializamos el sado y lo añadimos a movimientos
		Movimiento mov = new Movimiento();
		mov.setConcepto("Saldo ingresado: ");
		mov.setMiimporte(x);
		movimientos.add(mov);
	}

	public void ingresar(double x)throws Exception {
		if(filtros.FilterIngresarCantidad(x, MIN_INGRESAR)) {
		ingresar("Ingreso en efectivo: ",x);
		}else
		//se aplica la excepción si no se cumple el filtro.
			throw new Exception("No se ha podido ingresar la cantidad.");
	   }
		
	public void ingresar(String concepto, double x) throws Exception {
		Movimiento mov=new Movimiento();
		if(filtros.FilterIngresarCantidad(x, MIN_INGRESAR)) {
		mov.setConcepto(concepto);
		mov.setMiimporte(x);
		addMovimiento(mov);
		}else
		//se aplica la excepción si no se cumple el minimo para ingresar.
			throw new Exception("No se ha podido ingresar la cantidad.");
		
	}
	public void retirar(double x) throws Exception  {  
		if(filtros.FilterRetirarCantidad(x, getSaldo())){
		retirar("Retirada de efectivo",x);
		}else
		//se aplica la excepción si no hay saldo disponible.
			throw new Exception("No se ha podido ingresar la cantidad.");
		
    		
	}
	public void retirar(String concepto, double x) throws Exception {
		Movimiento mov=new Movimiento();
		if(filtros.FilterRetirarCantidad(x, getSaldo())) {
			mov.setConcepto(concepto);
			mov.setMiimporte(-x);
			addMovimiento(mov);
		}else
			//aplicamos la excepción si no hay saldo suficiente
			throw new Exception("No hay saldo suficiente en la cuenta para realizar la operación");
	}
	
	public String getTitular()  {
		return titular;
	}

	public void setTitular(String titular)  {
	
		this.titular = titular;
		
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	public List<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(List<Movimiento> movimientos) {
	
		this.movimientos = new ArrayList<Movimiento>(movimientos);	
	}

	@Override
	public String toString() {
		return "\n*************************************************\n\n \t\tEXTRACTO BANCARIO\n\n*************************************************\nCuenta del titular:\t" 
	+ getTitular() +"\nNº de cuenta:\t" + getNumero() + "\nSaldo disponible:\t"+getSaldo()+
				"\n\nHa realizado los siguientes MOVIMIENTOS\n"+getMovimientos();
	}


	protected void addMovimiento(Movimiento m) {
		List<Movimiento>mov=getMovimientos();
		mov.add(m);
		
		
	}

}
