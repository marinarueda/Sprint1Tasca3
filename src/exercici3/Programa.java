package exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Programa {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		//Lectura de archivo
		 HashMap<String, String> countries = new HashMap<String, String>();
	        
	        try {
	            BufferedReader reader = new BufferedReader(new FileReader("C:/Users/Marina/Desktop/IT ACADEMY/Countries.txt"));
	            String linea = reader.readLine();

	            while (linea != null) {
	                String[] partes = linea.split(" ");
	                if (partes.length >= 2) {
	                    countries.put(partes[0], partes[1]);
	                }
	                linea = reader.readLine();
	            }

	            reader.close();

	        } catch (IOException e) {
	            System.out.println("Error de lectura del archivo");
	        }

	        //System.out.println(countries);
		

	
	 System.out.println("Introduce tu nombre:");
     
     String userName = scanner.nextLine();

     int score = 0;
     for (int i = 0; i < 10; i++) {
         String randomCountry = getRandomCountry(countries);
         String capital = countries.get(randomCountry);

         System.out.println("Cual es la capital de " + randomCountry + "?");
         String entrada = scanner.nextLine();
         String answer = entrada.substring(0, 1).toUpperCase() + entrada.substring(1).toLowerCase();

         if (answer.equals(capital) ) {
             score++;
             System.out.println("Correcto! Puntuación actual: " + score);
         } else {
             System.out.println("Incorrecto. La capital es " + capital + ". Puntuación actual: " + score);
         }
     }

     System.out.println("Tu puntuación final es de:" + score+" puntos");
     
     
     try {
         FileWriter clasificacion = new FileWriter("classificacio.txt");
         clasificacion.write("El concursante "+userName + ": Ha conseguido "+ score+" puntos");
         clasificacion.close();
     } catch (IOException e) {
         System.out.println("Error en la escritura del fichero");
     }
		
     

}

	 public static String getRandomCountry(HashMap<String, String> countries) {
	        Object[] countryArray = countries.keySet().toArray();
	        Random random = new Random();
	        int randomIndex = random.nextInt(countryArray.length);
	        return (String) countryArray[randomIndex];
	    }
	
	
}
	

