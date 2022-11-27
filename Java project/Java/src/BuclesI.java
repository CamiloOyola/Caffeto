import javax.swing.*;

import java.awt.Color;

public class BuclesI {

	public static void main(String[] args) {
	
		
		
		UIManager UI = new UIManager ();
	
		UI.put("OptionPane.background" , new Color(56,166,238));
		UI.put("Panel.background" , new Color(56,166,238));
		
		
		String usuarioing = JOptionPane.showInputDialog(null , "Nombre de usuario: " , "Registro" , -1 );
		
		
		
		String passwording = JOptionPane.showInputDialog(null,"Contraseña: " , "Registro" , -1);
		
		
		
		String user1 = JOptionPane.showInputDialog(null ,"Ingrese el usuario: " , "Login Facebook" , -1 );
		
		
		
		
		
		
		while (  user1.equals(usuarioing)==false) {
			
			
			
			if (user1.equals(usuarioing)==false) {
				
				JOptionPane.showMessageDialog(null, "Usuario invalido");
				
			}
			
			user1 = JOptionPane.showInputDialog(null,"Ingrese el usario: " , "Login Facebook" , -1);
			
			
		}
			
		String password1 = JOptionPane.showInputDialog(null ,"Ingrese la contraseña: " , "Login Facebook" , -1 ) ; 
			
			
		while (passwording.equals(password1)==false) {
				
				
				if (passwording.equals(password1)==false ) {
					
					JOptionPane.showMessageDialog(null,"Contraseña invalida" , "Login Facebook" , -1);
					
				}
				
				password1 = JOptionPane.showInputDialog(null ,"Ingrese la contraseña: " , "Login Facebook" , -1);
				
				
			}	
		
		
		JOptionPane.showMessageDialog(null, "Bienvenido!" , "Inicio" , -1);
		

	}

}
