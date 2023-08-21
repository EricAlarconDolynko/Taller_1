package uniandes.dpoo.taller0.modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// Imprime "Hola Mundo"
		System.out.println("Hola, mundo!");
		
		// Esta parte carga el csv de atletas.csv
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("./data/atletas.csv");
		System.out.println("Se cargó el archivo atletas.csv con información de los Juegos Olímpicos. \n");
	
		
		// Imprime el país con más medallistas y el número de medallistas correspondiente
		Map <String,Integer> hash = calc.paisConMasMedallistas();
		for (String indice: hash.keySet()) {
			System.out.println("El país con más medallistas es " + indice + 
								" con " + hash.get(indice)+ " medallas");
		}
	}
	

}
