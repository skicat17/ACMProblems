

import java.util.*;
public class TalkingAboutNumbers {

	public void printWord(int n,String ch) {
		String  one[] = {" ", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen"};

		String ten[] = {" ", " ",  " twenty", " thirty", " forty", " fifty", " sixty", "seventy", " eighty", " ninety"};

		if(n > 19) { 
			System.out.print(ten[n / 10]+ " " + one[n % 10]);
		} else {
			System.out.print(one[n]);
		}

		if(n > 0) {
			System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		if(n == 0) {
			System.out.print("zero");
		}
		TalkingAboutNumbers a = new TalkingAboutNumbers();
		a.printWord((n / 1000000000), " hundred million");
		a.printWord((n / 10000000) % 100, " million");
		a.printWord(((n / 100000) % 100), " hundred thousand");
		a.printWord(((n / 1000) % 100), " thousand");
		a.printWord(((n / 100) % 10), " hundred");
		a.printWord((n % 100), "");

	}
}