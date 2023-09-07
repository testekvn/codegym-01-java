package Buoi_08.btvn.svmanagement;

import java.util.Random;

public class DataFaker {
     Random random = new Random();

    public float getRandomFloat() {
        return Float.parseFloat(String.format("%.2f", getRandomNumber() + random.nextFloat()));
    }
    public float getRandomFloat(int lLimit) {
        return Float.parseFloat(String.format("%.2f", lLimit + random.nextFloat()));
    }

    public int getRandomNumber() {
        return (random.nextInt(9));
    }

    public int getRandomNumberTOEIC() {
        int lLimit = 0;
        return (lLimit + random.nextInt(198)) * 5;
    }

    public String getRandomFullName() {
        String name = "John Wick";
        return name + (random.nextInt(10));
    }

}
