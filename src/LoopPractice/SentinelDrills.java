package LoopPractice;

import java.util.Scanner;

public class SentinelDrills {
    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static void main(String[] args){
        int inputNumber = 0;
        while (inputNumber >= 0) {
            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);
            inputNumber = input.nextInt();
            if (isOdd(inputNumber) && inputNumber>=0)
                System.out.println("Wow, that’s odd!");
        }
        System.out.println("Enter a number to check how many times we can repeatedly divide the number by 2 to get down to 1:");
        Scanner input = new Scanner(System.in);
        int checkNumber = input.nextInt();
        int count = 0;
        while (checkNumber >1){
            checkNumber /= 2;
            count ++;
        }
        System.out.println(count);

    }
}
