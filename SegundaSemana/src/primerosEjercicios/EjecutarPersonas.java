package src.primerosEjercicios;

import java.util.Scanner;

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
		Cliente c3=new Cliente();
		System.out.println("Introduce el nombre del nuevo cliente: ");
		Scanner entrada= new Scanner(System.in);
		String nombre=entrada.nextLine();
		c3.setNombre(nombre);
		System.out.println("El nombre metido por consolda es: "+c3.getNombre()+"\n");
		ClienteExportacion expor= new ClienteExportacion("Andrea", "Madrid", "andrea@gmailcom", "344334");
		System.out.println("El cliente con nombre: "+expor.getNombre()+
				"con residencia: "+expor.getDireccion()+ " y correo: "
				+expor.getCorreo()+", su VAT es : "+expor.getVat());
		
		
		


	}

	
	}

