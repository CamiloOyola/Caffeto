import javax.swing.JOptionPane;

public class Multiplicacion {

	public static void main(String[] args) {
		
	int a , b , c , d , e , f , g , h ,i,  j, multiplicacion;
		
		a= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));
		b= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		c= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		d= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		e= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		f= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		g= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		h= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		i= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		j= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
		
		
		multiplicacion= (a*b*c*d*e*f*g*h*i*j);
		
		JOptionPane.showInternalMessageDialog(null, "El resultado de la multiplicacion es: " + multiplicacion);

	}

}
