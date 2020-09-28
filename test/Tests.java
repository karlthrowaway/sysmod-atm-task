import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void Test1(){
        Bank swedbank = new Bank("Swedbank", 10f, false);
        Card card = new Card("EE23941284925", 1234, swedbank);
        User john = new User("John", card);
        ATM atm = new ATM(swedbank, false);
        assertEquals(atm.getMoneyInStorage(), 50000);
    }

    @Test
    public void Test2(){
        Bank swedbank = new Bank("Swedbank", 10f, false);
        Card card = new Card("EE23941284925", 1234, swedbank);
        User john = new User("John", card);
        ATM atm = new ATM(swedbank, false);
        assertEquals(atm.getMoneyInStorage(), 50000);
    }


}
