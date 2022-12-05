import java.util.Scanner;
public class BasicOperation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("Enter three numbers: ");
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		int S = x + y + z;
		double A = S / 3;
		double P = x * y * z;
		
		System.out.println("Display Sum: " + S);
		System.out.println("Display Average: " + A);
		System.out.println("Display Product: " + P);
	}

}
