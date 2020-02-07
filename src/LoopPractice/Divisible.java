package LoopPractice;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
        System.out.println("Enter a low number:");
        Scanner input1 = new Scanner(System.in);
        int lowNumber = input1.nextInt();
        System.out.println("Enter a high number:");
        Scanner input2 = new Scanner(System.in);
        int highNumber = input2.nextInt();
        for(int i = lowNumber; i <= highNumber; i++){
            if((i%4==0)&&(i%5!=0)){
                System.out.println(i);
            }
        }
    }
}
