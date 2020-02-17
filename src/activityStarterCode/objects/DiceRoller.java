package activityStarterCode.objects;

public class DiceRoller {
    public static void main (String[] args){
        Die die1 = new Die(10);
        for(int i = 0; i <= 10; i++){
            die1.roll();
            System.out.println("Roll " + i + " generated a " + die1.toString());
        }
        Die die2 = new Die(10);
        int countSame = 0;
        for (int j = 0; j <= 1000000; j++){
            die1.roll();
            die2.roll();
            if (die1.getValue() == die2.getValue()){
                countSame++;
            }
        }
        System.out.print("In 1000000 rolls, the two dies agreed "+ countSame + " times.");

    }
}
