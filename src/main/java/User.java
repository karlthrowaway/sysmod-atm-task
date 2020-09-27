public class User {

    private String name;
    private int PIN;
    private float money;
    private boolean hasCard;

    public User(String name, int PIN, float money, boolean hasCard) {
        this.name = name;
        this.money = money;
        this.hasCard = hasCard;
    }

    public void login(int pin) {}

    public void operation() {}

    public void insertCard() {}

    public void takeCard() {}

    public void takeMoney() {}

    public String getName() {
        return name;
    }

    public int getPIN() {
        return PIN;
    }

    public float getMoney() {
        return money;
    }

    public boolean isHasCard() {
        return hasCard;
    }
}
