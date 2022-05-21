import java.util.Scanner;

public class entradaDouble {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double y;
		y = sc.nextDouble();
		System.out.println("Você digitou: " + y);
		System.out.printf("Você digitou: %.2f%n" + y);
		
		sc.close();
	}

}
