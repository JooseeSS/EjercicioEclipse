package prueba;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		/*Realizar un programa que lea una frase del teclado y nos indique:
● cuantas palabras contiene. (0,5 ptos)
● cual es la palabra de mayor longitud y la de menor longitud, con el número de caracteres
de cada una. (1,5 ptos)
*/
var sc = new Scanner(System.in);



        // Leer la frase del teclado
        System.out.print("Ingrese una frase: ");
        String frase = sc.nextLine();

        // Separar las palabras de la frase
        String[] palabras = frase.split("\\s+");

        // Inicializar variables para calcular la palabra más larga y la más corta
        String palabraMasLarga = "";
        String palabraMasCorta = palabras[0]; // Inicializar con la primera palabra

        for (String palabra : palabras) {
            // Comparar longitud para la palabra más larga
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
            // Comparar longitud para la palabra más corta
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
        }

        // Mostrar los resultados
        System.out.println("Número de palabras: " + palabras.length);
        System.out.println("Palabra más larga: \"" + palabraMasLarga + "\" con " + palabraMasLarga.length() + " caracteres.");
        System.out.println("Palabra más corta: \"" + palabraMasCorta + "\" con " + palabraMasCorta.length() + " caracteres.");

        sc.close();

	}
	

}
