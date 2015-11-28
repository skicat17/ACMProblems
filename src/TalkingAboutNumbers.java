import java.util.*;

public class TalkingAboutNumbers {

	public String printWord(int n) {
		String test = null;
		String  one[] = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
				"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

		String ten[] = {"", "",  "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

		if(n > 19) { 
			test = ten[n / 10] + " " + one[n % 10];
		} else {
			test = one[n];
		}

		return test;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String add;

		while(n != -1) {
			TalkingAboutNumbers a = new TalkingAboutNumbers();
			if(n > 1000) {
				add = a + " " + "thousand";
			} 

			if(n < 100000) {
				add = a + " " + "hundred thousand";
			}

			System.out.print(a.printWord(n / 1000000000));
			System.out.print(a.printWord((n / 10000000) % 100));
			System.out.print(a.printWord(((n / 100000) % 100)));
			System.out.print(a.printWord(((n / 1000) % 100)));
			System.out.print(a.printWord(((n / 100) % 10)));
			System.out.print(a.printWord((n % 100)));
		}
	}
}
