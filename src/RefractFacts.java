import java.util.*;


public class RefractFacts {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		int h = s.nextInt();
		int x = s.nextInt();
		double n1 = s.nextFloat();
		double n2 = s.nextFloat();
		double angle1 = 0;
		double angle2 = 0;
		double angle1Rad = 0;
		double angle2Deg = 0;

		for(int i = 0; i <= 90; i++) {
			angle1 = i;
			angle1Rad = Math.toRadians(angle1);
			angle2 = Math.asin((n2 * Math.sin(angle1Rad)) / n1);
			angle2Deg = Math.toDegrees(angle2);
			
		}
		System.out.println(d);
		System.out.println(h);
		System.out.println(x);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(angle2Deg);

	}

}
