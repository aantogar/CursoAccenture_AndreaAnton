package primerosEjercicios;

public class EjecutarPersonas{

	
	
	public static void main(String[] args) {
		Usuario usu1=new Usuario();
		usu1.setCodigo("12345");
		usu1.setNombre("Antonio");
		usu1.setDirec("Barcelona");
		Cliente c1=new Cliente();
		c1.setNombre("Lujan");
		c1.setFecha("24-06-2022");
		c1.setCorreo("cliente@gmail.com");
		c1.enviarMensaje();
		c1.leyendo();
		System.out.println(c1.aString());	
		System.out.println(" El objeto creado "+
				"con nombre: "+usu1.getNombre()+
				" hemos asignado un código "+usu1.getCodigo()+
				" y también una ciudad: "+usu1.getDireccion());
		
		


	}

	
	}
