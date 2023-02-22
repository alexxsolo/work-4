package guru.ga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {

    @Test
    void assertTrueTest() {
        assertTrue( 4>2);
    }
    @Test
    void assertFalseTest() {
        assertFalse( 4<2);
    }
}
