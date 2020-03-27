package trójelementowa;
import java.util.*;

public class trójelementowa {public static class Triple {
    public int Greatest(int[] numbers) {
        int greatest = numbers[0];
        if (numbers[1] > greatest) {
            greatest = numbers[1];
        }
        if (numbers[2] > greatest) {
            greatest= numbers[2];
        }
        return greatest;
    }
    public int greatest2(int[] numbers) {
        return Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
    }
    public static void main(String[] args) {
        Triple sample = new Triple();
        int[] numbers = new int[]{0, 7, -1};
        System.out.println(sample.Greatest(numbers));
        System.out.println(sample.greatest2(numbers));
    }
}
}
