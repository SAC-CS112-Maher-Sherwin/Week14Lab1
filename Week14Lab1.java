package week14lab1;

public class Week14Lab1 {

    public static void main(String[] args) {
        
        RandomNumber[] test = new RandomNumber [4];
        
        test [0] = new Dice ();
        test [1] = new Dice ();
        test [2] = new Card ();
        test [3] = new Card ();
        
        for ( RandomNumber currentRandomNumber : test)
        {
            System.out.printf("%s Outcome: %d\n", currentRandomNumber.toString(),
                    currentRandomNumber.getOutcome());
        }
    }
    
}
