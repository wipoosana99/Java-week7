package week7;
import java.util.Scanner;

public class GetUserInfo {
	public static void main(String[]args) {
		String name;
		int age;
		int a,b,c;
		a = 5;
		b = 10;
		c = 20;
		int total = a*b+c;
		int total2 = a+b*c;
		int total3 = (b/a)*c;
		Scanner inputDevice = new Scanner(System.in);
		System.out.print("Please enter name >> ");
		name = inputDevice.nextLine();
		System.out.print("Please enter age >>  ");
		age = inputDevice.nextInt();
		System.out.println(" Your name is "+ name + " Your age is " + age + " years old ");
		System.out.println("Total a * b + c =  " + total);
		System.out.println("Total a + b * c =  " + total2);
		System.out.println("Total (b / a) * c =  " + total3);
	}
}
