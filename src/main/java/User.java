import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private float cash;
    private List<Card> cards;

    public User(String name, Card card) {
        this.name = name;
        this.cards = new ArrayList<>();
        cards.add(card);
    }

    public void login(int pin) {}

    public void operation() {}

    public void insertCard(ATM atm, Card card) {
        atm.insertCard(card);
    }

    public void takeCard(ATM atm) {
        atm.removeCard();
    }

    public void takeMoney() {}

    public String getName() {
        return name;
    }

    public float getCash() {
        return cash;
    }

    public List<Card> getCards() {
        return cards;
    }
}
