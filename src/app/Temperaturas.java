package app;

public class Temperaturas {

	public static void convertir() {
		
		String [] [] temperaturasData = {
				{"", "Seleccione la escala de temperatura", ""},
				{"C°", "grados Celsius", ""},
				{"F°", "grados Fahrenheit", ""},
				{"K°", "grados Kelvin", ""},
				{"Ra°", "grados Rankine", ""}
				};
		
		String [] datosIngresados = VentanaDatos.solicitarDatos(
				"conversor de temperaturas",
				"Ingrese la temperatura base",
				"Ingrese la temperatuta objetivo",
				temperaturasData);
		
		double valorAConvertir = Double.parseDouble(datosIngresados[2]);
		String temperaturaBase= datosIngresados[0];
		String temperaturaObjetivo= datosIngresados[1];
		String tipoConversion = temperaturaBase + " --> " + temperaturaObjetivo;
		
		double conversion =0;
		
		switch (tipoConversion) {
		
		case "grados Celsius --> grados Fahrenheit":
				conversion = (9 * valorAConvertir / 5) + 32;
				break;
				
		case "grados Celsius --> grados Kelvin":
			conversion = valorAConvertir + 273.15;
			break;
			
		case "grados Celsius --> grados Rankine":
			conversion = ((9 * valorAConvertir) / 5) + 491.67;
			break;
			
		case "grados Fahrenheit --> grados Celsius":
			conversion = (5 *(valorAConvertir - 32)) / 9 ;
			break;
			
		case "grados Fahrenheit --> grados Kelvin":
			conversion = ((5 *(valorAConvertir - 32)) / 9) + 273.15;
			break;
			
		case "grados Fahrenheit --> grados Rankine":
			conversion = valorAConvertir + 459.67;
			break;
			
		case "grados Rankine --> grados Celsius":
			conversion = (5 * (valorAConvertir - 491.657)) / 9;
			break;
			
		case "grados Rankine --> grados Kelvin":
			conversion = ((5 * (valorAConvertir - 491.657)) / 9) + 273.15;
			break;
			
		case "grados Rankine --> grados Fahrenheit":
			conversion = valorAConvertir - 459.67;
			break;
		}
		
		conversion = Math.floor(conversion);
		
		VentanaMostrar.resultados(datosIngresados, conversion);
	}
}
