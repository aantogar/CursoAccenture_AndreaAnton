package bancoAppPracticar;

import java.util.ArrayList;
import java.util.List;

public  class  Cuenta{
	private List<Movimiento>mMovimiento=new ArrayList<Movimiento>();
	private String mNumero;
	private String mTitular;
	
	public Cuenta(String numero, String titular) {
		//generamos el constructor con los atributos obligatorios
		this.mTitular=titular;
		this.mNumero=numero;
	}
	public void addMovimiento(Movimiento m) {
		//añadidos al arraylist los movimientos que se crean
		mMovimiento.add(m);
		
	}
	public void getSaldo() {
		
	}
	public void ingresar(double x) {
		
		
	}
	public void ingresar(String concepto, double x) throws Exception {
		/*double cant=0;
		Movimiento mov=new Movimiento();
		//comprobamos que la cantidad a ingresar es mayor que 0
		if(x > 0) {
			cant+=x;
			concepto="Ingreso: "+x;
		}else {
			throw new Exception("La cantidad tiene que ser superior");
		}
		//añadimos concepto y cantidad a movimientos
		*/
		
	}
	public void retirar(double x) {
		
	}
	public void retirar(String concepto, double x) {
		
	}
	public List<Movimiento> getmMovimiento() {
		return mMovimiento;
	}
	public void setmMovimiento(List<Movimiento> mMovimiento) {
		this.mMovimiento = mMovimiento;
	}
	public String getmNumero() {
		return mNumero;
	}
	public void setmNumero(String mNumero) {
		this.mNumero = mNumero;
	}
	public String getmTitular() {
		return mTitular;
	}
	public void setmTitular(String mTitular) {
		this.mTitular = mTitular;
	}

}