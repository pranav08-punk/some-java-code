package accenture;
import java.util.Scanner;

public class oxygen {

	public static void main(String args[]) {

		Scanner br = new Scanner(System.in);

		System.out.println("Enter the floor area of the room(m*m)");
		float a = br.nextFloat();
		float b = br.nextFloat();

		System.out.println("Enter the floor area of the room(m*m)");
		float area = br.nextFloat();

		double totalplants = (a * b / area * 100 * 100);
		totalplants -= totalplants % 10;

		double oxygen = (totalplants * 0.9);

		System.out.println("Total plants placed on floor area " + (String.format("%.2f", a)) + "*"
				+ (String.format("%.2f", a)) + " is " + (String.format("%.2f", totalplants)) + " plants produces "
				+ (String.format("%.2f", oxygen)) + " litres of oxygen in a day");
	}

}

