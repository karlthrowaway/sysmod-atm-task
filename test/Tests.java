import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    public void Test1(){
        User john = new User("John", 1234, 0.2f, false);
        Bank swedbank = new Bank("Swedbank", 10f, false);
        ATM atm = new ATM(swedbank, false);
        assertEquals(atm.getMoneyInStorage(), 50000);
    }

    @Test
    public void Test2(){
        User john = new User("John", 1234, 0.2f, false);
        Bank swedbank = new Bank("Swedbank", 10f, false);
        ATM atm = new ATM(swedbank, false);
    }


}
