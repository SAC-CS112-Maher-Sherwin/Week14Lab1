package week14lab1;

public class Card implements RandomNumber {
    
    @Override
    public int getOutcome() {
        int pick = 1 + (int)(Math.random()*52);
        return pick;
        
    }

    @Override
    public String toString()
    {
        return String.format("Card");
    }
}
