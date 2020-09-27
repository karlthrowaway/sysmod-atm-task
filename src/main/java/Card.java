public class Card {

    private String cardNumber;
    private int pin;
    private Bank bank;

    public Card(String cardNumber, int pin, Bank bank){
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.bank = bank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public Bank getBank() {
        return bank;
    }


}
