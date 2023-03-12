package app;

class Divisas {
	
	public static void convertir() {
		
		String [] [] divisasData = { 
				{"", "Seleccione una unidad", "1"},
				{"USD", "dólares estadounidenses", "1"},
				{"CRC", "colones costarricenses", "548.18"},
				{"EUR", "Euros", "0.9380"},
				{"GPB", "libras esterlinas", "0.8295"},
				{"JPY", "yen japonés", "134.91"},
				{"LSP", "wons sur-coreanos", "1315.75"}
				};
		
		String [] datosIngresados = VentanaDatos.solicitarDatos(
				"conversor de divisas",
				"Ingrese la divisa base",
				"Ingrese la divisa objetivo",
				divisasData);
		
		double valorAConvertir = Double.parseDouble(datosIngresados[2]);
		double divisaBase= Double.parseDouble(datosIngresados[3]);
		double divisaObjetivo= Double.parseDouble(datosIngresados[4]);
		
		double conversion = valorAConvertir / divisaBase * divisaObjetivo;
		
		VentanaMostrar.resultados(datosIngresados, conversion);
	}
}
