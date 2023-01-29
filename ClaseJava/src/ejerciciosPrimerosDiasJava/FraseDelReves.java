package src.ejerciciosPrimerosDiasJava;

public class FraseDelReves {
	public static void main(String[]args) {
		System.out.println(args[0]);
		String salida="";
		for(String ele:args) {
			salida= salida + ele + " ";
		}
		System.out.println(salida);
		System.out.println(args.length);
		String cadenaInvertida="";
		for (int x = salida.length() - 1; x >= 0; x--) {
            cadenaInvertida = cadenaInvertida + salida.charAt(x);
            
		}
	       /**
	        * Ejercicio frase al revés por CARÁCTERES
	        */
            System.out.println("LA FRASE AL REVÉS POR CARÁCTERES: ");
            System.out.println(cadenaInvertida);
            
            /**
             * Ejercicio frase al revés por palabras
             */
       String []palabras=salida.split(" ");
       int fin=palabras.length;
       String salida2="";
       for (int i= fin -1; i>=0; i--) {
    	   salida2= salida2 + palabras[i] +" ";
    	   
       }
       System.out.println("\nFRASE DEL REVÉS POR PALABRAS:");
       System.out.println(salida2);
       /**
        * Ejercicio de cambiar las vocales por números
        */
       
       System.out.println("\nCAMBIAR VOCALES POR NÚMEROS:");
       char letra;
       int salida22=salida.length();
       for (int i=salida22-1;i>=0;i--) {
    	   char nose=salida.charAt(i);
    	   switch(nose) {
    	   case 'a':
    		   nose='4';
    		   break;
    	   case 'e':
    	   case 'E':
    		   nose='3';
    		   break;
    	   case 'i':
    		   nose= '1';
    		   break;
    	   case 'o':
    		   nose= '6';
    		   break;
    	   case 'u':
    		   nose='7';
    	       break;
    	   }
    	   System.out.print(nose);
       }
       System.out.println("\n\nFRASE DEL REVÉS SIN UTILIZAR LENGTH");
       StringBuilder stringBuilder = new StringBuilder(salida);
		// Y llamar al método reverse de StringBuilder (lo convertimos a cadena con toString)
		String invertida = stringBuilder.reverse().toString();
		System.out.println("\nCadena original: " + salida);
		System.out.println("\nCadena invertida: " + invertida);
		  /**
		   * Otra manera de hacerr el ejercicio anterior.
		   */
		System.out.println("\n\nOTRA MANERA DE HACER EL EJERCICIO ANTERIOR:\n"
				+ "");
		char bus=salida.charAt(0);
		String salida5="";
		for(int a=1;(salida+bus).charAt(a)!=bus;a++) {
			System.out.print(salida.charAt(a)); 
			salida5=salida.charAt(a)+salida5;
		}
		System.out.println();
		System.out.println(salida5);
		
		System.out.println("\n\nOTRA MANERA MÁS DE HACER EL EJERCICIO ANTERIOR:\n"
				+ "");
		salida+=(char)0;
		int pos=0;
		String salida6="";
		while(salida.charAt(pos)!=(char)0) {
			salida6=salida.charAt(pos++)+salida6;
		}System.out.println(salida6);
		
	}

}
