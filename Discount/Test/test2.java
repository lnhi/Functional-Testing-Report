import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class test2 {
    Discount d = new Discount();
    @Test
    public void testCase1() {
        assertEquals(-1, d.check(-1, -1));
    }
    @Test
    public void testCase2() {
        assertEquals(-1, d.check(-1, 0));
    }
    @Test
    public void testCase3() {
        assertEquals(-1, d.check(-99999, 61));
    }
    @Test
    public void testCase4() {
        assertEquals(-1, d.check(-99999, 181));
    }
    @Test
    public void testCase5() {
        assertEquals(-1, d.check(0, -1));
    }
    @Test
    public void testCase6() {
        assertEquals(2, d.check(7, 0));
    }
    @Test
    public void testCase7() {
        assertEquals(3, d.check(3, 180));
    }
    @Test
    public void testCase8() {
        assertEquals(-1, d.check(4, 181));
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
        assertEquals(1, d.check(14, 61));
    }
    @Test
    public void testCase12() {
        assertEquals(-1, d.check(16, 99999));
    }
    @Test
    public void testCase13() {
        assertEquals(-1, d.check(20, -99999));
    }
    @Test
    public void testCase14() {
        assertEquals(2, d.check(23, 30));
    }
    @Test
    public void testCase15() {
        assertEquals(3, d.check(21, 120));
    }
    @Test
    public void testCase16() {
        assertEquals(-1, d.check(22, 181));
    }
    @Test
    public void testCase17() {
        assertEquals(-1, d.check(24, -1));
    }
    @Test
    public void testCase18() {
        assertEquals(-1, d.check(99999, 0));
    }
    @Test
    public void testCase19() {
        assertEquals(-1, d.check(99999, 180));
    }
    @Test
    public void testCase20() {
        assertEquals(-1, d.check(24, 181));
    }
}
