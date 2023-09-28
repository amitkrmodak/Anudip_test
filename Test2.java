//Write a program to Menu driven program using switch statement ( Find addition, subtraction, multiplication and division of to integer numbers )
// Name: Amit Kumar Modak

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,ch=1;
		int num1, num2, result;
		

		while(true)
		{
			System.out.print("Enter the first number: ");
			num1 = sc.nextInt();	
			System.out.print("Enter the second number: ");
			num2 = sc.nextInt();
			
            System.out.println("Enter 1 for Addition");
            System.out.println("Enter 2 for Subtraction");
            System.out.println("Enter 3 for Multiplication");
            System.out.println("Enter 4 for Division");
            System.out.println("Enter 5 for Exit");
            System.out.print("Enter your choice=");
            choice = sc.nextInt();

            
            switch (choice) {
                case 1:
                    
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case 2:
                    
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case 3:
                    
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case 4:
                  double div_result = num1 / num2;
                  System.out.println("Result: " + div_result);
                    
                    break;
                case 5:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
			
        } 
    }
}
