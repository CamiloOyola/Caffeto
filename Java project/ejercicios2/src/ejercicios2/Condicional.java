package ejercicios2;

import javax.swing.JOptionPane;

public class Condicional {

	public static void main(String[] args) {
		
	

		int a ;
		
		do {
			
			
			a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad: "));
		
		
		}while (a<0); 
			
		
		if (a>=18) {
		
		JOptionPane.showMessageDialog(null, "Puede ingresar a la fiesta", "Mensaje de ingreso" , 1);
		
		}
		
		
		else if (a>0 && a<18) {
			
			JOptionPane.showMessageDialog(null, "No puede ingresar a la fiesta" , "Mensaje de ingreso" , 2);

			
		}


}
		

		
	}


	
	

