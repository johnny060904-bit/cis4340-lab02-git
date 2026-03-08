public class Fixed {
    public static void main(String[] args) {
        String role = new String("admin");

        if ("admin".equals(role)) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}