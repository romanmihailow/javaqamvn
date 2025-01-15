import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {

    @Test
    public void testRegisteredUnderLimit() {
        BonusService service = new BonusService();
        int expected = 150;
        int actual = service.calcBonus(5000, true);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnregisteredUnderLimit() {
        BonusService service = new BonusService();
        int expected = 50;
        int actual = service.calcBonus(5000, false);
        Assertions.assertEquals(expected, actual);
    }
}
