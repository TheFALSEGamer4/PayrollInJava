import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double dayOneTime = dayOneTime(); // day one
		double dayTwoTime = dayTwoTime(); // day two
		double dayThreeTime = dayThreeTime(); // day three
		double dayFourTime = dayFourTime(); // day four
		double dayFiveTime = dayFiveTime(); // day five

		double totalTime = dayOneTime + dayTwoTime + dayThreeTime + dayFourTime + dayFiveTime;

		double payment;
		System.out.println("");

		System.out.print("Payrate: ");
		double payrate = scan.nextDouble();

		payment = totalTime * payrate;
		// tax
		System.out.print("Tax %: ");
		double tax = scan.nextDouble();
		tax = tax / 10;
		double finalPay = payment * tax;
		System.out.println("");

		System.out.println("Total Time: " + totalTime);
		System.out.println("Payment is " + finalPay);
	}

	public static double dayOneTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("");

		double mins;
		int hours = 0;
		double time;

		System.out.print("Day One Start Time: ");
		String startime = scan.next();
		System.out.print("Day One End Time: ");
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
		time = hours + (mins / 10);
		return time;
	}

	public static double dayTwoTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("");

		double mins;
		int hours = 0;
		double time;

		System.out.print("Day Two Start Time: ");
		String startime = scan.next();
		System.out.print("Day Two End Time: ");
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
		time = hours + (mins / 10);
		return time;
	}

	public static double dayThreeTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("");

		double mins;
		int hours = 0;
		double time;

		System.out.print("Day Three Start Time: ");
		String startime = scan.next();
		System.out.print("Day Three End Time: ");
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
		time = hours + (mins / 10);
		return time;
	}

	public static double dayFourTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("");

		double mins;
		int hours = 0;
		double time;

		System.out.print("Day Four Start Time: ");
		String startime = scan.next();
		System.out.print("Day Four End Time: ");
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
		time = hours + (mins / 10);
		return time;
	}

	public static double dayFiveTime() {
		Scanner scan = new Scanner(System.in);
		System.out.println("");

		double mins;
		int hours = 0;
		double time;

		System.out.print("Day Five Start Time: ");
		String startime = scan.next();
		System.out.print("Day Five End Time: ");
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
		time = hours + (mins / 10);
		return time;
	}
}
