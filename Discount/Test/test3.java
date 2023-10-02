import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test3 {
    Discount d = new Discount();

    @Test
    public void testCase1() {
        assertEquals(-1, d.check(24, 20));
    }

    @Test
    public void testCase2() {
        assertEquals(3, d.check(21, 120));
    }

    @Test
    public void testCase3() {
        assertEquals(1, d.check(9, 90));
    }

    @Test
    public void testCase4() {
        assertEquals(2, d.check(7, 20));
    }

    @Test
    public void testCase5() {
        assertEquals(0, d.check(8, 60));
    }
}