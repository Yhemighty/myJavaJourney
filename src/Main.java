/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second number:");
        int secondNumber = input.nextInt();

        int multiplication = firstNumber * secondNumber;
        System.out.println(" multiplication is " + multiplication);


        int subtraction = firstNumber - secondNumber;
        System.out.println(" subtraction is " + subtraction);

        double division = (double) firstNumber  / secondNumber;
        System.out.println(" division is " + division);
    }*/



/*public class Main{

public static void main(String[] args) {
    System.out.println("\"I love you\"");
    }
}*/



/*public class Main{

    public static void main(String[] args) {
        System.out.printf("%s%n%s%n", "I love you with all", "my heart!");
    }
}*/


/*import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your first integer");
        int firstInteger = input.nextInt();
        System.out.println("Enter your second integer");
        int secondInteger = input.nextInt();

        //to calculate square of each number
        int squareFirstInteger = firstInteger * firstInteger;
        System.out.println("Square of firstInteger is " + squareFirstInteger);
        int squareSecondInteger = secondInteger * secondInteger;
        System.out.println("Square of secondInteger is " + squareSecondInteger);

        //to calculate the sum of their squares
        int sumOfSquares = squareFirstInteger + squareSecondInteger;
        System.out.println("sum of Squares is " + sumOfSquares);

        //to calculate the difference of the squares
        int diffOfSquares = squareFirstInteger - squareSecondInteger;
        System.out.println("Difference of Squares is " + diffOfSquares);
    }
}*/

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstInteger = input.nextInt();
        System.out.print(" Enter second integer: ");
        int secondInteger = input.nextInt();
        System.out.print("Enter third integer: ");
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger; //to find the sum

        int average = sum / 3; //to find the average

        int product = firstInteger * secondInteger * thirdInteger; //to find the product


        //to find the smallest integer

        int smallest = firstInteger;
        if (secondInteger < smallest) {
            smallest = secondInteger;

        }
        if (thirdInteger < smallest) {
            smallest = thirdInteger;

        }

        //to find the largest

        int largest = firstInteger;
        if (secondInteger > largest) {
            largest = secondInteger;

        }
        if (thirdInteger > largest) {
            largest = thirdInteger;
       // to print out results
            System.out.println("Sum is " + sum);
            System.out.println("Average is " + average);
            System.out.println("Product is " + product);
            System.out.println("Smallest is " + smallest);
            System.out.println("Largest is " + largest);
        }
    }
}


