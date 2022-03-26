package Com.java;

public class Bucle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// While

		int numero = 0;
		while (numero <= 10) {
			System.out.println("El numero es" + numero);
			++numero;

		}
//DO While. Cuantas veces se tiene que sumar un numero para llegar a 100?

		int numerolimite = 100;
		int sumatotal = 0;
		int count = 0;
		do {
			sumatotal += numerolimite;
			++count;

		} while (sumatotal < 100);
		System.out.println("El numero se sumo" + count);

// FOR

		int numeroFor = 10;
		for (int i = 1; i <= numeroFor; ++i) {
			System.out.println("El del For es" + i);
		}

	}

}
