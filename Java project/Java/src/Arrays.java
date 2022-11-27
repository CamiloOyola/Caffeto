import javax.swing.JOptionPane;

public class Arrays {

	public static void main(String[] args) {
		
	/*	int [] array = new int[5] ;
		
		array[0] = 1 ;
		
		array[1]= 2 ;
		
		array[2]= 3 ; 
		
		array[3]= 4 ;
		
		array[4]= 5 ;
		
		*/	
		
		
		
		int [] array = new int [5];
		
		
		for ( int i=0 ; i<array.length ; i++) {
			
			
			array [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor : "));
			
			
		
			
			
		}
		
		
		for(int elementos: array) {
			
			System.out.println(elementos);
		
		
		}
		

	}

}
