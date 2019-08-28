import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double payment;
		System.out.println("");

		System.out.print("How many days to you want to calculate? ");
		int days = scan.nextInt();

		double mins;
		int hours = 0;
		double time = 0.0;

		int i = 1;
		while (i <= days) {
			System.out.println("");

			System.out.print("Day " + i + " Start Time: ");
			String startime = scan.next();
			System.out.print("Day " + i + " End Time: ");
			String endtime = scan.next();
			int index1 = startime.indexOf(':');
			int index2 = endtime.indexOf(':');
			int a = Integer.parseInt(startime.substring(0, index1));
			int b = Integer.parseInt(startime.substring(index1 + 1));
			int c = Integer.parseInt(endtime.substring(0, index2));
			int d = Integer.parseInt(endtime.substring(index2 + 1));

			if (d > b) {
				int min1 = d - b;
				mins = min1 / 6;
			} else {
				int min1 = d + 60 - b;
				mins = min1 / 6;
			}
			if (c < a) {
				c += 12;
			}
			hours = c - a;
			if (i == 1) {
				time = hours + (mins / 10);
			} else {
				time += hours + (mins / 10);
			}
			i++;
		}

		System.out.print("Payrate: ");
		double payrate = scan.nextDouble();

		payment = time * payrate;
		// tax
		System.out.print("Tax %: ");
		double tax = scan.nextDouble();
		tax = tax / 100;
		double taxcut = payment * tax;
		double finalPay = payment - taxcut;
		System.out.println("");

		System.out.println("Total Time: " + time);
		System.out.println("Payment is " + finalPay);
	}

}
