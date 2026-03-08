public class Fixed {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name.");
            return;
        }

        String filename = args[0];

        if (filename.contains("..") || filename.contains("/") || filename.contains("\\")) {
            System.out.println("Invalid file name.");
            return;
        }

        System.out.println("Opening file: " + filename);
    }
}