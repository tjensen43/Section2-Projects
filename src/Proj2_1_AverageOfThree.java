import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num1;
        double num2;
        double num3;
        System.out.println("What is your first number");
        num1 = keyboard.nextDouble();

        System.out.println("What is your second number");
        num2 = keyboard.nextDouble();

        System.out.println("What is your third number");
        num3 = keyboard.nextDouble();

        double numMean = (num1 + num2 + num3) / 3;
        System.out.println("Mean of the three numbers is: " + numMean);

    }


}
