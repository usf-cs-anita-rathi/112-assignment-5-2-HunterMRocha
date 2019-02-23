import java.util.Scanner; 


public class setTemp {
	Scanner input = new Scanner(System.in);
	public String scale; 
	public float Degree; 
	public float newDegree;
	
	
	public void writeOutput() {
		System.out.println("You are using the " + scale + " scale");
		System.out.println("You converted "+ Degree + "in " + scale + " to " + newDegree + " Degrees");
	}
	
	
	
	public String scale() {
		System.out.println("pick a scale C or F");
		scale = input.next();
		return scale; 
	}
	
	
	
	public void Conversion() {
		if(scale.equalsIgnoreCase("c")) {
			pickC();
		}
		else {
			pickF();
		}
	}
	
	
	
	public void pickC() {
		System.out.println("pick a temperature for C");
		Degree = input.nextInt();
		newDegree =  (9*(Degree)/5+32);
	}
	
	public void pickF() {
		System.out.println("pick a temperature for F");
		Degree = input.nextInt();
		newDegree = (5/9) * (Degree - 32);
	}
	
	
	
	

	

}
