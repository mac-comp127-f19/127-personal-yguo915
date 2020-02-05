public class DoNDrills {
    public static void main (String[] args){
        for(int i =0; i< 10; i++){
            System.out.println(i);
        }
        for(int i =10; i>= 0; i--){
            System.out.println(i);
        }
        int a = 1;
        for(int i =0; i< 8; i++){
            a *=2;
            System.out.println(a);
        }
        int b = 0;
        for(int i =0; i< 8; i++){
            b = b*2 +1;
            System.out.println(b);
        }
        for(int i =0; i<= 25; i++){
            System.out.println(Math.sqrt(i*2+1.0));
        }

    }
}
