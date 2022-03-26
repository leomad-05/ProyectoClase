package Com.java;

public class CondicionalEstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int velocidad = 100; //70kmH
		int limitevelocidad = 80;
		
		if (velocidad > limitevelocidad) {
		
		System.out.println("El coche va a exceso de Velocidad");
		
		}else {
			System.out.println("El coche va a la velocidad adecuada");
		}
	
				
// IF Anidado
		
	boolean carretera = true;
	if (carretera) {
		
		System.out.println("Estas en una carretera");
		
		limitevelocidad = 110; //kmh
		
		if (velocidad > limitevelocidad) {
			
			System.out.println("El coche va a exceso de Velocidad");
			
			}else {
				System.out.println("El coche va a la velocidad adecuada");
			}
//IF ELSE
	}else if (velocidad > limitevelocidad) {
		System.out.println("El coche esta en una calle y va a exceso de velocidad");
	}else {
		System.out.println("El coche esta en una calle y va a una velocidad adecuada");
		
 //SWITCH Case		
		
	int temperatura = 0;
		switch(temperatura) {
		
	case 5:
		System.out.println("Mucho Frio");
	  break;
		
	case 10:
		System.out.println("Frio!");
	  break;	
		
	case 20:
		System.out.println("Clima Agradable!!");
	  break;
		
	case 30:
		System.out.println("Calor!!");
	  break;
		
	default:
		System.out.println("No encontro relacion con la temperatura");
	  break;
		
		}
	}
	

	}	

}

