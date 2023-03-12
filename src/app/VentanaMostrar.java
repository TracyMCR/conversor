package app;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class VentanaMostrar {
	
	public static void resultados(String [] datosIngresados, double resultado) {
		

		DecimalFormat resultadoCrudo = new DecimalFormat("#,###.00"); 
		//FORMATEA EL RESULTADO PARA EVITAR LA NOTACIÓN CIENTIFICA 
		// MUESTRA NUMERO CON ESPACIOS ENTRE MILES Y MUESTRA 2 DECIMALES
		
		if (resultado < 0.01) {
			resultadoCrudo = new DecimalFormat("#,###.0000"); 
			//FORMATEA EL RESULTADO PARA EVITAR LA NOTACIÓN CIENTIFICA 
			// MUESTRA NUMERO CON ESPACIOS ENTRE MILES Y MUESTRA 4 DECIMALES		
			}

		String resultadoFormateado = resultadoCrudo.format(resultado);

		String salidaResultado = datosIngresados[2] + 
				" " + datosIngresados[0] + 
				" equivalen a " + resultadoFormateado + 
				" " + datosIngresados[1];
		
		JOptionPane.showMessageDialog(
				null,
				salidaResultado ,
				"RESULTADO DE LA CONVERSIÓN",
				JOptionPane.INFORMATION_MESSAGE,
				null);
		
		int confirmarSalir = JOptionPane.showConfirmDialog(
				null,
				"¿Desea efectuar otra conversión?",
				"APLICACION DE CONVERSIONES",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null
				);

		if (confirmarSalir == JOptionPane.YES_OPTION) {
			
			VentanaInicio.menu();
			
		} else {
			
			JOptionPane.showMessageDialog(
					null,
					"Programa terminado",
					"FIN DE LA APLICACION",
					JOptionPane.INFORMATION_MESSAGE,
					null);
			System.exit(0);
		} 
	}
}