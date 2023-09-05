import java.util.Random;

public class Dice {
    private Integer low, high;
    private Random random;
    public Dice(Integer low, Integer high) {
        this.low = low;
        this.high = high;
        random = new Random();
    }

    public Integer roll() {
        // return a random number between low and high
        return random.nextInt(high - low + 1) + low;
    }
}
