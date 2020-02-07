package LoopPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LowAndHigh {
    public static void main(String[ ] args){
        boolean askForInput = true;
        List<Integer> numberList = new ArrayList<>();
        while (askForInput){
            System.out.println("Enter a number:");
            Scanner input = new Scanner(System.in);
            int inputNumber = input.nextInt();
            if (inputNumber == -1){
                askForInput = false;
            }
            else{
                numberList.add(inputNumber);
            }
        }
        Collections.sort(numberList);
        System.out.println("Max="+numberList.get(0)+", Min="+numberList.get(numberList.size()-1));
    }

}

