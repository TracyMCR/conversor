package app;

import javax.swing.*;

public class VentanaInicio {
		
	public static void menu() {

		String [] opciones = {
				"Seleccione el tipo de conversión",
				"Conversión de divisas", 
				"Conversión de temperaturas", 
				"Conversión de longitudes",
				"Conversión de áreas",
				"Conversión de volúmenes",
				};
		String opcionSeleccionada = "";
		boolean usuarioEscoge = false;
		
		do {
			opcionSeleccionada = (String)JOptionPane.showInputDialog(
					null,
					"¿Qué tipo de conversión desea efectuar?", 
					"APLICACION DE CONVERSIONES", 
					JOptionPane.QUESTION_MESSAGE,
					null, opciones, opciones[0]);

			if (opcionSeleccionada.equals(opciones[0])) {			
				JOptionPane.showMessageDialog(null, "Seleccione una opción de conversión", "", JOptionPane.WARNING_MESSAGE);	
			} else {
				usuarioEscoge = true;
			}
			
		} while(!usuarioEscoge);
		
		switch (opcionSeleccionada) {
			case "Conversión de divisas": {
				Divisas.convertir();
				break;		
			}			
			case "Conversión de temperaturas": {
				Temperaturas.convertir();			
				break;
			}		
			case "Conversión de longitudes": {
				Unidades.convertir("longitud");
				break;
			}				
			case "Conversión de áreas": {
				Unidades.convertir("area");			
				break;
			}		
			case "Conversión de volúmenes": {
				Unidades.convertir("volumen");			
				break;
			}
		} // switch	
	} // opciones()	
} // InterfazUsuario



