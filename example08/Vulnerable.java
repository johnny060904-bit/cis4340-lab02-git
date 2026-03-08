public class Vulnerable {
    public static void main(String[] args) {
        String role = new String("admin");

        if (role == "admin") {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}