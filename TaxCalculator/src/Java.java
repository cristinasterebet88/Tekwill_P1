public class Java {
    public static void main(String[] args) {
        double price = 100.0;
        double tax = 0.2;
        int quantity = 5;
        double total = 0;
        String message = "I want to buy " + quantity + " shirt!";

        total = price * quantity * tax;

        System.out.println(message);
        System.out.println("Total cost with tax is: " + total);
    }
}
