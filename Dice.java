package week14lab1;

public class Dice implements RandomNumber {
    
    @Override
    public int getOutcome() {
        int roll = 1 + (int)(Math.random()*6);
        return roll;
    }
    
    @Override
    public String toString()
    {
        return String.format("Dice");
    }
    
}
