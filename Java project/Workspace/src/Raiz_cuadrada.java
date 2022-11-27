import javax.swing.JOptionPane;

public class Raiz_cuadrada {

	public static void main(String[] args) {
		
		double a , b , c , d , e , f , g , h ,i,  j,k,l,m,n,p ,raiz,raiz1,raiz2;
		
		
		a= Double.parseDouble(JOptionPane.showInputDialog("Digite el primer numero: "));
		b= Double.parseDouble(JOptionPane.showInputDialog("Digite el segundo numero: "));
		c= Double.parseDouble(JOptionPane.showInputDialog("Digite el tercer numero: "));
	
		
		
		raiz= Math.sqrt(a);
		raiz1= Math.sqrt(b);
		raiz2= Math.sqrt(c);
		
		JOptionPane.showMessageDialog(null, "El resultado de las raices de los tres numeros son: " + raiz + raiz1 + raiz2);
		
		
	}

}
