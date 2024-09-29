package section03.backend;
import org.junit.*;

import static org.junit.Assert.*;

public class CharacterCounterTest {
    @Test(expected=IllegalArgumentException.class)
    public void testNullInput() {
        CharacterCounter.counterCharacters(null);
    }

    @Test
    public void testEqual() {
        assertEquals(1,1);
    }

}