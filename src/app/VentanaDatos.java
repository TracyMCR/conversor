package app;

import javax.swing.JOptionPane;

public class VentanaDatos {
	
	public static String [] solicitarDatos(String tituloVentana, String instruccionesBase, String instruccionesObjetivo, String [][] datos) {
		
		String [] listaMenu = new String[datos.length];
		boolean esNumero = false;
		
		for (int i = 0; i < datos.length; i++) {
			listaMenu[i] = datos[i][1];
		}

		String [] datosIngresados = new String[5];
		
		do {
			datosIngresados[2] = JOptionPane.showInputDialog(
					null,
					"Ingrese el valor que desea convertir",
					"VALOR A CONVERTIR",
					JOptionPane.INFORMATION_MESSAGE
				); // RECIBE LE VALOR A CONVERTIR
			
			try {
				double validar = Double.parseDouble(datosIngresados[2]);
				esNumero = true;
				
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Ingrese un valor numérico", "", JOptionPane.WARNING_MESSAGE);
			}			
		} while (!esNumero);
		
		boolean usuarioEscoge = false;
		
		do {
			datosIngresados[0] = (String)JOptionPane.showInputDialog( // RECIBE LA UNIDAD BASE
					null,
					instruccionesBase, 
					tituloVentana.toUpperCase(), 
					JOptionPane.QUESTION_MESSAGE, 
					null, listaMenu, listaMenu[0]);
			if (datosIngresados[0].equals(listaMenu[0])) {
				
				JOptionPane.showMessageDialog(null, "Seleccione una unidad de conversión");
			} else {
				usuarioEscoge = true;
			}	
		} while(!usuarioEscoge);
		
		usuarioEscoge = false;
		
		do {
			datosIngresados[1] = (String)JOptionPane.showInputDialog( // RECIBE LA UNIDAD BASE
					null,
					instruccionesObjetivo, 
					tituloVentana.toUpperCase(), 
					JOptionPane.QUESTION_MESSAGE, 
					null, listaMenu, listaMenu[0]);
			if (datosIngresados[1].equals(listaMenu[0])) {
				
				JOptionPane.showMessageDialog(null, "Seleccione una unidad de conversión");
			} else {
				usuarioEscoge = true;
			}			
		} while(!usuarioEscoge);
		
		for (int i = 0; i < datos.length; i++) {
			
			if (datos[i][1].equals(datosIngresados[0])) {			
				datosIngresados[3] = datos[i][2];           // RECIBE LA RELACIÓN DE CONVERSION BASE
			}
			
			if (datos[i][1].equals(datosIngresados[1])) {	// RECIBE LA RELACIÓN DE CONVERSION OBJETIVO		
				datosIngresados[4] = datos[i][2];
			}					
		}	
		return datosIngresados;
	}
}
