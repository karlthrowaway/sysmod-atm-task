import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    @Test
    public void StructureTest(){
        Bank swedbank = new Bank("Swedbank", 10f, false);
        Card card = new Card("EE23941284925", 1234, swedbank);
        User john = new User("John", card);
        john.getCards().add(card);
        ATM atm = new ATM(swedbank, false);
        john.insertCard(atm, card);
    }

    @Test
    public void AssociationTest(){
        Bank swedbank = new Bank("Swedbank", 10f, false);
        Card card = new Card("EE23941284925", 1234, swedbank);
        Card card2 = new Card("EE2394121252145", 4321, swedbank);
        User john = new User("John", card);
        john.getCards().add(card);
        ATM atm = new ATM(swedbank, true);
        john.insertCard(atm, card);
        assertTrue(john.getCards().size() > 1);
    }


}
