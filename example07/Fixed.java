import java.util.Arrays;

public class Fixed {
    private int[] scores = {90, 80, 70};

    public int[] getScores() {
        return Arrays.copyOf(scores, scores.length);
    }

    public static void main(String[] args) {
        Fixed test = new Fixed();
        int[] values = test.getScores();
        values[0] = 0;

        System.out.println(test.getScores()[0]);
    }
}