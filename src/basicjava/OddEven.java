package basicjava;

import java.util.Scanner;

public class OddEven {

    public static boolean isOdd(int num){
        return num % 2 != 0;
    }

    public static void main(String[] args){

        System.out.println("Enter a number:");
        Scanner input = new Scanner(System. in);
        int inputNumber = input.nextInt();
        if (isOdd(inputNumber))
            System.out.println("Wow, that’s odd!");

    }

}

