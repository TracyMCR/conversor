package app;

public class Unidades{
	
	public static void convertir(String unidad) {
		
		String [][] unidadesDatos = new String[4][3];
		String [][] longitudesDatos = {
				{"", "Seleccione una unidad", "1"},
				{"km", "kilómetros", "1000"},
				{"m", "metros", "1"},
				{"cm", "centímetros", "0.01"},
				{"mm", "milímetros", "0.001"},
				{"pulg", "pulgadas", "0.0254"},
				{"ps", "pies","0.3048"},
				{"NM", "millas náuticas", "1852"},
				{"SM", "millas estatuto", "1609.35"},
				{"yd", "yarda", "0.9144"},
				};
		
		String [][] areasDatos = { 
				{"", "Seleccione una unidad", "1"},
				{"km2", "kilómetros cuadrados", "1000000"},
				{"m2", "metros cuadrados", "1"},
				{"pulg2", "pulgadas cuadradas", "0.00064516"},
				{"ps2", "pies cuadrados","0.09290"},
				{"cm2", "centímetros cuadrados", "0.0001"},
				{"Ha", "hectáreas", "10000"},			
				};
		
		String [][] volumenesDatos = { 
				{"", "Seleccione una unidad", "1"},
				{"m3", "metros cúbicos", "1"},
				{"cm3", "centímetros cúbicos", "0.000001"},
				{"US Gal", "galones US", "0.00378541"},
				{"ps3", "pies cúbicos","0.0283168"},
				{"l", "litros", "0.001"},
				};
		
		String tipoConversorTitle = "";
	
		switch (unidad) {
		
		case "longitud":
			unidadesDatos = longitudesDatos;
			tipoConversorTitle = "conversor de longitudes";
			break;
			
		case "area":
			unidadesDatos = areasDatos;
			tipoConversorTitle = "conversor de áreas";
			break;
			
		case "volumen":
			unidadesDatos = volumenesDatos;
			tipoConversorTitle = "conversor de volúmenes";
			break;
		}
	
		String [] datosIngresados = VentanaDatos.solicitarDatos(
				tipoConversorTitle ,
				("Ingrese " + unidad + " base"),
				("Ingrese " + unidad + " objetivo"),
				unidadesDatos);
		
		double valorAConvertir = Double.parseDouble(datosIngresados[2]);
		double unidadBase= Double.parseDouble(datosIngresados[3]);
		double unidadObjetivo= Double.parseDouble(datosIngresados[4]);

		double conversion = (valorAConvertir * unidadBase / unidadObjetivo);	
			
		VentanaMostrar.resultados(datosIngresados, conversion);
	}
}

