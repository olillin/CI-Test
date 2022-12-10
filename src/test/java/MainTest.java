import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void add1Test() {
        assertEquals(2, Main.add1(1));
    }
    @Test
    public void breakingTest() {
        assertEquals(1, 2);
    }
}
