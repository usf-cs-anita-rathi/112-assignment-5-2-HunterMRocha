import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Odometer {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		mutator set = new mutator();
		int carType;

		System.out.println("Welcome to the CS112 Automobile!");
		System.out.println("Which car would you like to take on the trip? ");
		System.out.format("%10s %10s %10s %10s\n", "1.Tesla \n", "2.Toyota RAV4 \n", "3.Ford Explorer \n","4.Honda Civic \n");
		carType = input.nextInt();

		while (carType < 1 || carType > 4) {
			System.out.println("INVALID INPUT. TRY AGAIN");
			System.out.format("%10s %10s %10s %10s\n", "1.Tesla \n", "2.Toyota RAV4 \n", "3.Ford Explorer \n","4.Honda Civic \n");
			carType = input.nextInt();
		}
			switch (carType) { // 4 different cases for 4 different cars
			case 1:
				set.setFuelEff();
				set.NumMiles();
				set.gallonsOfGas();
				set.calcSpeed();
				set.calcTime();
				set.writeOutput();
				set.resetOdom();
				System.out.println("Would you like to go another trip");
				String another = input.next();
				while (another.equalsIgnoreCase("yes")) { // loop that keeps running the program for multiple trips
					set.NumMiles();
					set.gallonsOfGas();
					set.calcSpeed();
					set.calcTime();
					set.writeOutput();
					System.out.println("Would you like to go another trip");
					another = input.next();
				}
				set.data();
				break;

			case 2:
				set.setFuelEff();
				set.NumMiles();
				set.gallonsOfGas();
				set.calcSpeed();
				set.calcTime();
				set.writeOutput();
				set.resetOdom();
				System.out.println("Would you like to go another trip");
				another = input.next();
				while (another.equalsIgnoreCase("yes")) {
					set.NumMiles();
					set.gallonsOfGas();
					set.calcSpeed();
					set.calcTime();
					set.writeOutput();
					System.out.println("Would you like to go another trip");
					another = input.next();
				}
				set.data();
				break;

			case 3:
				set.setFuelEff();
				set.NumMiles();
				set.gallonsOfGas();
				set.calcSpeed();
				set.calcTime();
				set.writeOutput();
				set.resetOdom();
				System.out.println("Would you like to go another trip");
				another = input.next();
				while (another.equalsIgnoreCase("yes")) {
					set.NumMiles();
					set.gallonsOfGas();
					set.calcSpeed();
					set.calcTime();
					set.writeOutput();
					System.out.println("Would you like to go another trip");
					another = input.next();
				}
				set.data();
				break;

			case 4:
				set.setFuelEff();
				set.NumMiles();
				set.gallonsOfGas();
				set.calcSpeed();
				set.calcTime();
				set.writeOutput();
				set.resetOdom();
				System.out.println("Would you like to go another trip");
				another = input.next();
				while (another.equalsIgnoreCase("yes")) {
					set.NumMiles();
					set.gallonsOfGas();
					set.calcSpeed();
					set.calcTime();
					set.writeOutput();
					System.out.println("Would you like to go another trip");
					another = input.next();
				}
				set.data();
				break;
			}

	}

}
