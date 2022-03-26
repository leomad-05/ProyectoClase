package Com.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Arrglo Unidimencional
		
				String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };
				System.out.println(dias[2]);

				String diasemana = dias[2];
				
		//  Con un FOR

				for (int i = 0; i < 7; ++i) {
					
				System.out.println(dias[i]);
				
		//----------------------------------------
		//Arrglo Didimencional
				
				String[][] amigo = new String [3][3];
				
				amigo[0][0] = "Ricardo";
				amigo[0][1] = "Leonardo";
				amigo[1][0] = "Carlos";
				amigo[2][0] = "Alejandro";
				amigo[2][1] = "Alan";
				amigo[2][2] = "Alondra";
						
				System.out.println(amigo[2][1]);
				
				}

		}
//llamar Metodo a MAIN
public static void metodo() {
	System.out.println("Hola Mundo");
}

public static int suma(int x, int y) {
	return x+y;

}

public static String frases(String frase, String frase2) {
	return frase+""+frase2;
		
}
	
public static void wrapperMethod() {
	metodo();
	suma(1,4);
	
}
}



