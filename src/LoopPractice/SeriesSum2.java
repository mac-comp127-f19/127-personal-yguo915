package LoopPractice;

public class SeriesSum2 {
    public static void main(String[] args){
        double sum = 0.0;
        int i = 1;
        while (sum <= 2){
            sum += (double)1/(i+1);
            i++;
        }
        System.out.print(i);
    }
}
