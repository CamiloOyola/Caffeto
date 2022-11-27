import javax.swing.JOptionPane;

public class Division {

	public static void main(String[] args) {
	
		
		double division ; double a , b ; 
		
		
		
		
		a= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero: "));
		b= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
		
		
		division= a/b;
		
		
		JOptionPane.showConfirmDialog(null, "El resultado de la division es: " + division); 

		
		
		
		

	}

}
