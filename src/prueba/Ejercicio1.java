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

System.out.println("Introduza la frase que quiera: ");
String frase = sc.nextLine();
int i;
 int numeroPalabras = 1;
for (i=0; i<frase.length(); i++) {
	if(Character.isSpaceChar(frase.charAt(i)) == true) {
		numeroPalabras++;
		
	}
	
}	
System.out.println("Su frase tiene un numero de " + numeroPalabras + " palabras");


	}
	

}
