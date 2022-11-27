
public class ClaseString {

	public static void main(String[] args) {
		
		
			String mi_nombre = "josecamilooyola";
			
			String mi_segundo = "JoseCamilooyola";
			
			// String es una clase, mi_nombre es una variable objeto y "juan" es la instancia del objeto mi_nombre ( asignarle un valor (cadena de caracteres en este ejemplo) al objeto)     
			
			System.out.println(mi_nombre.length());
			
			// El metodo length() devuelve la longitud de la cadena de caracteres , en este caso la longitud de la cadena de caracteres "juan" es de 4
		
		
			System.out.println(mi_nombre.charAt(0));
			
			// El metodo charAt() devuelve el caracter en la posicion 0 de la cadena de texto "juan"
		
			
			System.out.println(mi_nombre.substring(0, 4));
			
			// El metodo substring(x,y) devuelve una subcadena de caracteres donde x es el caracter donde empiza y Y es la cantidad de caracteres que se extraen a partir de x 
		
			System.out.println(mi_nombre.equals(mi_segundo));
			
			// El metodo equals(cadena) devuelve true si la dacena de caracteres es la misma que estamos comparando, de lo contrario false; 
			
			System.out.println(mi_nombre.equalsIgnoreCase(mi_segundo));
			
			// Igual que el metodo anterior compara dos cadenas de caracteres sin importar mayusculas o minusculas
			
			int ultima_letra = mi_nombre.length(); 
			
			System.out.println(mi_nombre.charAt(ultima_letra-1));
			
			// ultima_letra esta iniciañizada en cuatro ( longitud de la cadena de caracteres de mi_nombre ) 
			// y para saber el ultimo caracter de mi_nombre se usa el metodo chartAt() donde tiene como argumento el valor de ultimo_nombre -1 
			
	}

}
