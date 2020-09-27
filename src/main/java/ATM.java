public class ATM {

    private Bank bank;
    private Card card;
    private int moneyInStorage;
    private boolean userVerified;

    public ATM(Bank bank, boolean userVerified) {
        this.bank = bank;
        this.card = null;
        this.moneyInStorage = 50000;
        this.userVerified = userVerified;
    }

    public void insertCard(Card card) {
        this.card = card;
    }

    public void removeCard() {
        this.card = null;
    }

    public boolean canWithdrawMoney(int amount) {
        if (amount > moneyInStorage) return false;
        return true;
    }

    public Bank getBank() {
        return bank;
    }

    public Card getCard() {
        return card;
    }

    public int getMoneyInStorage() {
        return moneyInStorage;
    }

    public boolean isUserVerified() {
        return userVerified;
    }
}
