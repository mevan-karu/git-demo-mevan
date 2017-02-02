import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		String operation;
		int answer;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to my calculator");
		System.out.println("Enter First Number: ");
		a = scanner.nextInt();
		System.out.println("Enter Second Number: ");
		b = scanner.nextInt();
		System.out.println("Enter Operation:");
		operation = scanner.next();
		if ("+".equals(operation)){
			answer = add(a,b);
			System.out.println("Answer is: " + answer);
		} else {
			System.out.println("Unsupported Operation");
		}

	}
	
	private static int add(int a, int b){
		return a+b;
	}

}
