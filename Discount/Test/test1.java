import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test1 {
    Discount d = new Discount();
    @Test
    public void testCase1() {
        assertEquals(-1, d.check(-23, -1));
    }
    @Test
    public void testCase2() {
        assertEquals(-1, d.check(-1, 60));
    }
    @Test
    public void testCase3() {
        assertEquals(-1, d.check(-99999, 61));
    }
    @Test
    public void testCase4() {
        assertEquals(-1, d.check(-20, 181));
    }
    @Test
    public void testCase5() {
        assertEquals(-1, d.check(20, -1));
    }
    @Test
    public void testCase6() {
        assertEquals(2, d.check(23, 1));
    }
    @Test
    public void testCase7() {
        assertEquals(3, d.check(0, 61));
    }
    @Test
    public void testCase8() {
        assertEquals(-1, d.check(7, 181));
    }
    @Test
    public void testCase9() {
        assertEquals(-1, d.check(8, -1));
    }
    @Test
    public void testCase10() {
        assertEquals(0, d.check(19, 60));
    }
    @Test
    public void testCase11() {
        assertEquals(1, d.check(14, 180));
    }
    @Test
    public void testCase12() {
        assertEquals(-1, d.check(15, 181));
    }
    @Test
    public void testCase13() {
        assertEquals(-1, d.check(24, -1));
    }
    @Test
    public void testCase14() {
        assertEquals(-1, d.check(30, 1));
    }
    @Test
    public void testCase15() {
        assertEquals(-1, d.check(25, 180));
    }
    @Test
    public void testCase16() {
        assertEquals(-1, d.check(99999, 181));
    }
}