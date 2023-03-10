package src.personaHerenciaJava;

public class Profesor extends Persona{
	private float salario;
	private String fecContratacion;
	
	public Profesor(String codigo, String nombre,int edad, String telefono, float salario,String fecha) {
		super(codigo,nombre,edad,telefono);
		this.salario=salario;
		this.fecContratacion=fecha;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public String getFecContratacion() {
		return fecContratacion;
	}

	public void setFecContratacion(String fecContratacion) {
		this.fecContratacion = fecContratacion;
	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		super.mostrar();
		System.out.print("Salario: "+getSalario()+ "  euros y la fecha de contratación: "+getFecContratacion()+".");
	}

	

}
