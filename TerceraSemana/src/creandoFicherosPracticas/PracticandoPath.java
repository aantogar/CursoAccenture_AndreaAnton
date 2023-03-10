package creandoFicherosPracticas;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class PracticandoPath {

	public static void main(String[] args) throws IOException {
		/**
		 * Practicando y probando los métodos que se pueden emplear con los ficheros
		 */
		//Otra manera de llamar a la ruta
		//Path dir=Paths.get("ruta");
		FileSystem sistemaFicheros=FileSystems.getDefault();
		Path fichero=sistemaFicheros.getPath("C:\\Users\\andrea.anton.garcia\\OneDrive - Accenture\\Documents\\Prueba.txt");
		System.out.println(fichero.getFileName());
		System.out.println(fichero.getNameCount());
		System.out.println(fichero.getParent());
		System.out.println(fichero.getRoot());
		System.out.println(fichero.getName(2));
		System.out.println(fichero.getName(1));
		System.out.println(fichero.getName(3));
		System.out.println(fichero.toAbsolutePath());
		System.out.println(fichero.toRealPath());
		System.out.println(fichero.toFile());
		System.out.println(fichero.normalize());
		System.out.println(fichero.toFile());
		
		
	
		
		


	}

}
