public class Fixed {
    public static void main(String[] args) {
        int[] scores = {90, 85, 88};
        int index = 2;

        if (index >= 0 && index < scores.length) {
            System.out.println("Score: " + scores[index]);
        } else {
            System.out.println("Invalid index.");
        }
    }
}