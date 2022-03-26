package mx.ejercicio;

public class CoolParkTicket {
	
	double adultTicket, childTicket, studentTicket;
	int age;
	boolean student = false;
	String priceDay, park;

//Constructor
	
	public CoolParkTicket(double price, int personAge, boolean studentId) {
		adultTicket = price;
		childTicket	= price *(.80);
		studentTicket = price *(.50);
		  age = personAge;
		  student = studentId;
		  priceDay = "Normal Dar Price";
		    park = "Cool Park";
		    
		}
// Encapsular
	
//Setter
	
	private void setPriceDay(String PriceDay) {
		
		this.priceDay = priceDay;
		
	}
	
//Getter
	
	private String getpPriceDay(String priceDay) {
		return priceDay;
		
	}
	
	
//Metodo
	
public double getTicketPrice() {
	double priceTicket;
	if(student == true) {
		priceTicket = studentTicket;
		System.out.println("Student Price (50% applied): $"+studentTicket);
	}else if(age>=18) {
		priceTicket = adultTicket;
		System.out.println("Adult Price: $"+adultTicket);
	}else {
		priceTicket = childTicket;
		System.out.println("Child Price (20% applied): $"+childTicket);
		}
	return priceTicket;
		}


//Sobre Cargar el Metodo OverLoading
public void printPriceDay() {
System.out.println(park + getPriceDay(priceDay));
	
}
public void printPriceDay(String keyManager, String priceDay) {
setPriceDay(priceDay);
System.out.println(park + getPriceDay(priceDay));
}

}
