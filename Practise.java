import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		String name;
		int age;
		double income;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		
		System.out.print("What is your anual income? ");
		income = keyboard.nextDouble();
		
		System.out.print("What is your name? ");
		name = keyboard.nextLine();
		
		System.out.println("Hello" + name + ". Your age is " + age + " and your income is $" + income);
	}
    
}
	
