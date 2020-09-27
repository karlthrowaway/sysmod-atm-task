import java.util.List;

public class Bank {

    private String name;
    private float userBalance;
    private boolean isBanned;
    private List<ATM> atms;

    public Bank(String name, float userBalance, boolean isBanned) {
        this.name = name;
        this.userBalance = userBalance;
        this.isBanned = isBanned;
    }

    public float getTotalAssets() {
        return userBalance;
    }

    public void logTransaction() {
        System.out.println("Did a transaction");
    }

    public boolean withdrawAmount(float amount) {
        if(amount > this.userBalance)
            return false;
        this.userBalance = this.userBalance - amount;
        return true;
    }

    public String getName() {
        return name;
    }

    public float getUserBalance() {
        return userBalance;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public List<ATM> getAtms() {
        return atms;
    }
}
