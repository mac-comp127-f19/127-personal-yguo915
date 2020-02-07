package LoopPractice;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        for (int i = 0; i <= inputNumber; i++){
            for (int j = 0; j < inputNumber-i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i*2 -1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
