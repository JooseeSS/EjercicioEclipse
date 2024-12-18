package prueba;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		/*Queremos gestionar la venta de entradas (no numeradas) de las zonas del local ConcertSala, el
cual dispone de distintas zonas con una capacidad o número de entradas por vender cada una.
Actualmente existen 3 zonas: la zona principal con 1000 entradas disponibles, la zona platea con
200 entradas disponibles y la zona vip con 25 entradas disponibles.
El menú del programa debe ser el que se muestra a continuación.
1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
Cuando elegimos la opción 2, se nos debe preguntar para qué zona queremos las entradas y
cuántas queremos. Lógicamente, el programa debe controlar que no se puedan vender más
entradas de la cuenta*/
		var sc = new Scanner(System.in);
		final int zonaPrincipal=1000;
		final int zonaPlata=200;
		final int zonaVip=25;
		
System.out.println("Vienvenid@ a la venta de entras del local ConcertSala, que desea?");
System.out.println("Pulse 1 para mostrar número de entradas libres, pulse 2 si quiere comprar un entrada y pulse 3 si desea salir de este menu: ");
int opcion = sc.nextInt();

if(opcion==1) {
	System.out.println("En la zona principal hay " + zonaPrincipal + " entradas disponibles, en la zona plata hay " + zonaPlata + " entradas disponibles y en la zona vip hay "+ zonaVip +" entradas disponibles");
}
if(opcion==2) {
	System.out.println("En que zona quiere las entradas 1(zona  pricipal), 2(zona plata) y 3(zona vip): ");
	int zona = sc.nextInt();
	
	if(zona == 1) {
		System.out.println("Perfecto cuantas entradas de la zona principal quieres: ");
		int entradas1 = sc.nextInt();
		
		if(entradas1>zonaPrincipal) {
			System.out.println("Lo sentimos pero no tenemos esa cantidad de entradas disponibles");
		}
		else
			System.out.println("Muchas gracias por comprar entradas en ConcertSala hasta pronto");
	}
	else if (zona == 2) {
		System.out.println("Perfecto cuantas entradas de la zona plata quieres: ");
		int entradas2 = sc.nextInt();
		
		
		if(entradas2>zonaPlata) {
			System.out.println("Lo sentimos pero no tenemos esa cantidad de entradas disponibles");
		}
		else
			System.out.println("Muchas gracias por comprar entradas en ConcertSala hasta pronto");
	}
	else
		System.out.println("Perfecto cuantas entradas de la zona vip quieres: ");
	int entradas3 = sc.nextInt();
	
	
	if(entradas3>zonaVip) {
		System.out.println("Lo sentimos pero no tenemos esa cantidad de entradas disponibles");
	}
	else
		System.out.println("Muchas gracias por comprar entradas en ConcertSala hasta pronto");
}
else
	System.out.println("Muchas gracias por buscar ConcertSala hasta pronto");
	}

}
