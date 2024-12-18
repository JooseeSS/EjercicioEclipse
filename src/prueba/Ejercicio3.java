package prueba;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
	

		var sc = new Scanner(System.in);
		double descvip = 0.95;
		double Km;
		
		//cliente introduce los km
			System.out.println("Introduzca el numero de km que ha conducido: ");
			double km = sc.nextDouble();
			
			//cliente introduce si es vip o no
			System.out.println("Introduzca 1 si es VIP o 2 si no lo es: ");
			int vip = sc.nextInt();
			
			//variables de tipo de facturacion
			
			double p2 = (km - 1000) * 0.15 + (300 + 200);
			double p1 = (km - 300) * 0.30 + (200);
			
			//Cálculo facturación y visualización del total
			if((km < 300) && (vip == 1)) {
				
			
			System.out.println("Total:" + 200 * descvip );
			}
				else if((km < 300) && (vip == 2)) {
				System.out.println("Total: " + 200);
				}
					else if((km >=300) && (km <= 1000) && (vip == 2 )) {
					System.out.println("Total no vip: " + (p1 * 1.21));
					}
						else if((km >= 300) && (km <= 1000) && (vip == 1)) {
						System.out.println("Total:" + (p1 * 0.95) * 1.21 );
						}
							else if((km > 1000) && (vip == 2)) {
							System.out.println("Total no vip" + (p2 * 1.21));
							}
							//ponemos el ultimo paso
								else if((km > 1000) && (vip == 1)) {
								System.out.println("Total vip: " + (p2 * 0.95 ) * 1.21 );
								}
			sc.close();
	
		
	}

}
