package ejerciciosBanco;

import java.time.LocalDate;
import java.util.Calendar;

import javax.xml.crypto.Data;

public class Debito extends Tarjeta{
	
	public Debito(String numero,String titular,LocalDate fecha) throws Exception {
		super(numero,titular,fecha);
		
	}

	@Override
	public void pagoEstablecimiento(String concepto, double x) throws Exception {
		// TODO Auto-generated method stub
		try {
			getCuentasoc().retirar("Ha pagado en el establecimiento: " + concepto, x);
			
		} catch (Exception e) {
			System.out.println("Saldo insuficiente para pagar en establecimiento");
		}
	}

	@Override
	public double getSaldo()  {
		// TODO Auto-generated method stub
		return getCuentasoc().getSaldo();
	}
	
	@Override
	public void ingresar(double x) throws Exception {
		// TODO Auto-generated method stub
		getCuentasoc().ingresar(x);
	}

	@Override
	public void retirar(double x) throws Exception {
		// TODO Auto-generated method stub
		getCuentasoc().retirar(x);
	}





}
