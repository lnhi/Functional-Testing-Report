import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test4 {
    Discount d = new Discount();

    @Test
    public void testCase1() {
        assertEquals(-1, d.check(24, 60));
    }

    @Test
    public void testCase2() {
        assertEquals(3, d.check(20, 180));
    }

    @Test
    public void testCase3() {
        assertEquals(1, d.check(19, 61));
    }

    @Test
    public void testCase4() {
        assertEquals(2, d.check(7, 1));
    }

    @Test
    public void testCase5() {
        assertEquals(0, d.check(9, 60));
    }
}