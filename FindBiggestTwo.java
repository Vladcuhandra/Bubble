import java.util.Scanner;

public class FindBiggestTwo {
    public static void main(String[] args) {

        // Creating a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to input 3 numbers
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Closing the scanner
        scanner.close();

        // Finding the largest and second largest numbers
        int largest, secondLargest;

        if (num1 > num2 && num1 > num3) {
            largest = num1;
            secondLargest = Math.max(num2, num3);
        } else if (num2 > num1 && num2 > num3) {
            largest = num2;
            secondLargest = Math.max(num1, num3);
        } else {
            largest = num3;
            secondLargest = Math.max(num1, num2);
        }

        // Calculating the sum of the two largest numbers
        int sum = largest + secondLargest;

        // Printing the result
        System.out.println("The sum of the two largest numbers is: " + sum);
    }
}


