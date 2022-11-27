import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Fruteria {

	public static void main(String[] args) {
		
		 double cantidad,valoraPagar,precio,descuento;
	        final double k= 4200;
	        DecimalFormat d = new DecimalFormat("###");
	        DecimalFormat i = new DecimalFormat("###,###.##");

	        cantidad=Double.parseDouble(JOptionPane.showInputDialog(null ,"Ingrese la cantidad de manzanas: "));

	        precio=cantidad*k;

	        if(cantidad>0 && cantidad <= 2 ){

	            JOptionPane.showMessageDialog(null,"La compra de " + d.format(cantidad) + "kilos tiene un valor de: " + i.format(precio) , "Supermercado", 2  );

	        }

	        else if(cantidad>2 && cantidad <= 5) {

	        descuento= precio * (0.10);
	        valoraPagar= precio - descuento ;
	            JOptionPane.showMessageDialog(null,"La compra de " + i.format(cantidad) + "kilos tiene un valor de: " + i.format(precio) + "pero tiene un descuento de: " + i.format(descuento) + "por lo tanto el valor a pagar: " + i.format(valoraPagar) ,"Supermercado", 2  );


	        }

	        else if (cantidad>5 && cantidad <=10){

	        	descuento= precio * (0.15);
		        valoraPagar= precio - descuento ;
		            JOptionPane.showMessageDialog(null,"La compra de " + i.format(cantidad) + "kilos tiene un valor de: " + i.format(precio) + "pero tiene un descuento de: " + i.format(descuento) + "por lo tanto el valor a pagar: " + i.format(valoraPagar) ,"Supermercado", 2  );

	        }

	        else if ( cantidad > 10 ) {

	        	descuento= precio * (0.2);
		        valoraPagar= precio - descuento ;
		        JOptionPane.showMessageDialog(null,"La compra de " + i.format(cantidad) + "kilos tiene un valor de: " + i.format(precio) + "pero tiene un descuento de: " + i.format(descuento) + "por lo tanto el valor a pagar: " + i.format(valoraPagar) ,"Supermercado", 2  );


	        }
		
	}

}
