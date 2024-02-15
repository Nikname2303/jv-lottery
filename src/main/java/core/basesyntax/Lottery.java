package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 101;
    private Random value = new Random();

    public int getRandomNumber() {
        return value.nextInt(MAX_NUMBER);
    }

    public String getRandomBall() {
        return new ColorSupplier().getRandomColor() + " " + getRandomNumber();
    }
}
