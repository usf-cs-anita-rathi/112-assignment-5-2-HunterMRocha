import java.io.*;
import java.util.Scanner;

public class mutator {

	Scanner input = new Scanner(System.in);
	private double milesDriven;
	private double odometer;
	private double FuelEff;
	private double Gas;
	private double time;
	private double speed;
	private String timeType;

	public boolean writeOutput() { // prints all the variables out
		System.out.println("\nTotal miles driven: " + milesDriven);
		System.out.println("Odometer: " + odometer);
		System.out.println("Fuel Efficiency: " + FuelEff);
		System.out.format("Gallons of gas used: %.2f \n", Gas);
		System.out.format("Your total trip length was %.2f", time);
		System.out.println(" " + timeType + "\n");
		return false; // this is here becuase of the txt file

	}

	public double resetOdom() { // gives user option of resetting odometer
		System.out.println("Would you like to reset the odometer? ");
		String response = input.next();
		if (response.toLowerCase().equals("yes")) {
			odometer = 0;
			System.out.println(writeOutput());
			return odometer;
		} else {
			return odometer;
		}
	}

	public double setFuelEff() { // sets the fuel Efficiency (MPG or MPGe if tesla)
		System.out.println("What would you like the Fuel Efficiency to be? ");
		FuelEff = input.nextInt();
		while (FuelEff < 10 || FuelEff > 200) {
			System.out.println("Invalid Amount. Try again");
			System.out.println("What would you like the new Fuel Efficiency to be? ");
			FuelEff = input.nextInt();
		}
		return FuelEff;
	}

	public double NumMiles() { // takes in the amount of miles driven
		System.out.println("How many miles did you drive? ");
		milesDriven = input.nextInt();
		odometer += milesDriven;
		return milesDriven;

	}

	public double gallonsOfGas() { // Calculates the amount of gas used
		Gas = Gas + milesDriven / FuelEff;
		return Gas;
	}

	public void data() throws IOException { // writes the writeOutput() method to a txt file
		PrintStream data = new PrintStream(new File("data.txt"));
		PrintStream console = System.out;
		System.setOut(data);
		System.out.println(writeOutput());

	}

	public void anotherTrip() { // loops the program if user wants to keep going on trips
		System.out.println("Would you like to go another trip");
		String another = input.next();
		if (another.equalsIgnoreCase("yes")) {
			NumMiles();
			gallonsOfGas();
		} else {
			System.exit(0);
		}

	}

	public double calcSpeed() { // takes in the speed of the driver
		System.out.println("How fast are you driving? [mph] ");
		speed = input.nextDouble();
		while (speed <= 5 || speed >= 130) {
			System.out.println("INVALID RESPONSE. TRY AGAIN");
			System.out.println("How fast are you driving? ");
			speed = input.nextDouble();
		}
		return speed;
	}

	public double calcTime() { // calculates length of trip based on speed and miles driven
		time = milesDriven / speed;
		if (time >= 1) {
			timeType = "hours";
		} else {
			timeType = "minutes";
		}
		return time;

	}

}
