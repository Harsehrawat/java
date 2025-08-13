package Abstraction;

// I am creating a Payment gateway which accepts payment through PhonePe and GooglePay.
// So, as my both PhonePe and GOoglePay wud have common methods like receiveTransaction, i'd create a superClass "Payment" and this SuperClass should be non-instantiable 

abstract class Payment {
    
    abstract void receiveTransaction(double amount); // why do i need to create this abstract method when i've to write this already in each of my subclass? see Abstraction/notes.txt.

    // Final method - cannot be overridden
    public final void generateReceipt(double amount) {
        System.out.println("=== Payment Receipt ===");
        System.out.println("Amount: $" + amount);
        System.out.println("Date: " + java.time.LocalDate.now());
        System.out.println("=======================");
    }

}

class PhonePe extends Payment {

    @Override
    public void receiveTransaction( double amount){ 
        System.out.println("PhonePe received Payment of: "+amount); 
        super.generateReceipt(amount);
    };

}
class GooglePay extends Payment {

    @Override
    public void receiveTransaction( double amount) { 
        System.out.println("GooglePay received Payment of: "+amount);
        super.generateReceipt(amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Payment phonepe = new PhonePe();
        Payment googlepay = new GooglePay();

        phonepe.receiveTransaction(10.00);
        googlepay.receiveTransaction(12.31);

    }
}