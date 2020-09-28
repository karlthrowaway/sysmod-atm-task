import java.util.List;

public class User {

    private String name;
    private float cash;
    private List<Card> cards;

    public User(String name, Card card) {
        this.name = name;
    }

    public void login(int pin) {}

    public void operation() {}

    public void insertCard() {}

    public void takeCard() {}

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
