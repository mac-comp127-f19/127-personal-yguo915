package LoopPractice;

import java.util.Scanner;

public class SquareNums {
    public static void main(String[] args) {
        Boolean notDivisibleFour = true;
        while (notDivisibleFour) {
            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);
            int inputNumber = input.nextInt();
            if (inputNumber % 4 ==0)
                notDivisibleFour = false;
            else
                System.out.println(Math.pow(inputNumber, 2));
        }

    }
}
