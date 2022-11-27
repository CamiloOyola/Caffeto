import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner datos = new Scanner(System.in);
		
		String concatenar,palabra2,palabra1;
		double d,c ,potencia, division;
		int opcion, a , b, suma , resta, multiplicacion; 
		boolean  salir = false; 
		
	    System.out.println("=============================");
	    System.out.println("|Inicio del programa en Java|");
	    System.out.println("=============================\n ) ;    
	    

		
		while(!salir) {
			
		System.out.println("opcion 2 (suma)"); 
		System.out.println("opcion 3 (resta)"); 
		System.out.println("opcion 4 (multiplicacion)");
		System.out.println("opcion 5 (division)");
		System.out.println("opcion 6 (concatenar)");
		System.out.println("Opcion 7 (elvar a una potencia)");
		System.out.println("Opcion");
	
		
		System.out.println("Elige una opcion: ");
		opcion = datos.nextInt();
		System.out.println();
		
		
		switch(opcion) {
		
		case 1 :
			
			System.out.println("Ingrese el primer numero: ");
			a= datos.nextInt();
			System.out.println("Ingrese el segundo numero: ");
			b= datos.nextInt();
			
			suma = a+b ;
			
			System.out.println("El resultado de la suma es: " + suma);
			
			break;
			
		case 2 : 
			
			System.out.println("Ingrese el primer numero: ");
			a= datos.nextInt();
			System.out.println("Ingrese el segundo numero ");
			b= datos.nextInt();
			
			resta= a-b;
			
			System.out.println("El resultado de la resta es: " + resta);
			
			
			
			break;
			
			
			
		case 4:
			
			System.out.println("Ingrese el primer numero: ");
			a= datos.nextInt();
			System.out.println("Ingrese el segundo numero ");
			b= datos.nextInt();
			
		multiplicacion= a*b;
		
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
			
			
		case 5: 
			
			System.out.println("Ingrese el primer numero: ");
			c = datos.nextDouble();
			System.out.println("Ingrese el segundo numero ");
			d = datos.nextDouble();
			System.out.println();
			
			division= (c/d);
			
			System.out.println("El resultado de la division: "+ division);
			System.out.println("El resultado de la ");
			System.out.println();
			
			
			
			break;
			
		case 6: 
			
			System.out.println("Ingrese la primera palabra que quiere concatenar: ");
			palabra1 = datos.next();
			
			System.out.println("Ingrese la segunda palabra que quiere concatenar: ");
			palabra2= datos.next();
			
			
	
			System.out.println("El resultado de la concatenacion es: "+ palabra1 + palabra2 );
			
			
			
			break; 
			
		case 7 : 
			
			System.out.println("Ingrese el primer numero: ");
			
			c = datos.nextDouble();
			
			System.out.println("Ingrese el segundo numero: ");
			
			d= datos.nextDouble();
			
			potencia= Math.pow(c, d);
			
			System.out.println("El resultado de la potenciacion es: "+ potencia);
	
		default: 
			
			System.out.println("El valor no esta dentro del rango");
		
			
		
		}
		

		}
		
		System.out.println("fin del menu");
	}

}
