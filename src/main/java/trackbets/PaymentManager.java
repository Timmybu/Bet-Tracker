package trackbets;

import java.util.ArrayList;
import java.util.List;

public class PaymentManager {

    public static final List<Payment> PAYMENTS = new ArrayList<>();

    public record Payment(String name, double amount) {}

    public static void removePayment(Payment payment) {
        PAYMENTS.remove(payment);
    }
}
