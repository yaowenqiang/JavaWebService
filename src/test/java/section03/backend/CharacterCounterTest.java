package section03.backend;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCounterTest {
    @Test(expected=IllegalArgumentException.class)
    public void testNullInput() {
        CharacterCounter.counterCharacters(null);
    }

}