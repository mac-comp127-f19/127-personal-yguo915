package activityStarterCode.objects;

public class Die {
    private int dieInternalState = -1;
    private int Max_Value;

    public Die (int maxValue){
        Max_Value = maxValue;
    }

    public void roll(){
        dieInternalState= (int) (Math.random() * Max_Value +1);
    }
    public int getValue(){
        return dieInternalState;
    }
    @Override
    public String toString() {
        switch (dieInternalState){
            case (1): return "one";
            case (2): return "two";
            case (3): return "three";
            case (4): return "four";
            case (5): return "five";
            case (6): return "six";
            case (7): return "seven";
            case (8): return "eight";
            case (9): return "nine";
            case (10): return "ten";
            case (11): return "eleven";
            case (12): return "twelve";





            default: return "Unknown";
        }
    }


}
