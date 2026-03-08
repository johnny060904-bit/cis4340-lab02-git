public class Vulnerable {
    private int[] scores = {90, 80, 70};

    public int[] getScores() {
        return scores;
    }

    public static void main(String[] args) {
        Vulnerable test = new Vulnerable();
        int[] values = test.getScores();
        values[0] = 0;

        System.out.println(test.getScores()[0]);
    }
}