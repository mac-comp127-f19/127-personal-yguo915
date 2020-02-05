package LoopPractice;

public class SeriesSum {
    public static void main(String[] args){
        double sum = 0.0;
        for (int i = 2; i<=10; i++){
            sum += (double)1/i;
        }
        System.out.print(sum);
    }

}
