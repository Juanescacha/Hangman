public class Frase {
	String fraseAdivinar="el edificio nuevo es un pantanero";
	String cadena = "";
	String letra = "a";

	public Frase() {
		// TODO Auto-generated constructor stub
	}
	public void mostrarRayitas() {
		
		
		for(int i=0; i< fraseAdivinar.length(); i++) {
			 if (!(fraseAdivinar.charAt(i) +"" ).equals(" ")) {
				 cadena+= "_ ";
			 }
			 else {
				 cadena+="  ";
			 }
					 }
		System.out.println(cadena);

	}
	
	
	public void ponerLetra() {
		
		/*for(int i=0; i< fraseAdivinar.length();i++) {
			if ((fraseAdivinar.charAt(i)+"").equals(letra)) {
				String nueva_cadena=cadena.replaceAll("_", letra);
				/*
				String subcadena = cadena.substring(0, i);
				String subcadena_1 = cadena.substring(i+1, cadena.length());
				cadena = subcadena + letra + subcadena_1;
				
				System.out.println(nueva_cadena);

			}
		} */
		String nueva_cadena = cadena.replaceAll("_", letra);
		System.out.println(nueva_cadena);
	}
}