package nidhi.strategies;

/**
 * Dummy credit card class.
 */
public class CreditClass {
    private int amount;
    private String number;
    private String date;
    private String cvv;

    CreditClass(String number, String date, String cvv) {
        this.amount = 100_000;
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}