package unico;

public class Ejercicio13 {

	public static void main(String[] args) {

		/*
		 * Implementar un método que como dato de entrada sea un año y como resultado un
		 * valor booleano de si se trata de un año bisiesto o no. Se sabe que son
		 * bisiestos todos los años múltiplos de 4, excepto los que sean múltiplos de
		 * 100 sin ser múltiplos de 400. Así que, por ejemplo, 2016, 2020, 2024 son
		 * bisiestos, 1600, 2000 y 2400 también son años bisiestos, pero 1700, 1800,
		 * 1900, 2100, 2200 y 2300 no lo son.
		 */

		int anio;
		boolean bisiesto;
		String mensaje;
		
		anio = Util.leerInt("Introduce un año para conocer si es bisiesto: ");
		
		bisiesto = añoBisiesto(anio);
		
		mensaje = bisiesto ? "Es un año bisiesto" : "No es un año bisiesto";
		
		Util.escribir(mensaje);
	}
	
	public static boolean añoBisiesto(int anio) {
		final int MULT4 = 4;
		final int MULT100 = 100;
		final int MULT400 = 400;
		boolean bisiesto = false;
		
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
			bisiesto = true;
		}		
		return bisiesto;
	}
	
}
