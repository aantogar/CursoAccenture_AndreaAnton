package src.herenciaEquiposJava;

public class Entrenador extends Trabajador{
	private String idFederacion;
	
	public Entrenador(String nombre, String apellidos,int edad, String federacion) {
		super(nombre, apellidos, edad);
		this.idFederacion=federacion;
	}

	@Override
	public String toString() {
		return "El entrenador que pertenece a la federación: " + idFederacion + ", con ID: " + getId() + ", apellidos: "
				+ getApellidos() + ", nombre: " + getNombre() + ", y edad: " + getEdad() + ".";
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	public void dirigirPartido() {
		System.out.println("El entreador "+getNombre()+ " "+getApellidos()+
				" está dirigiendo un partido en este momento.");
	}
	public void dirigirEntrenamiento() {
		System.out.println("El entreador "+getNombre()+ " "+getApellidos()+
				" está dirigiendo un entrenamiento en este momento.");
	}

}
