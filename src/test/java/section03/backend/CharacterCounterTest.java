package section03.backend;
import org.example.Main;
import org.junit.*;
import java.util.Map;

import static org.junit.Assert.*;

public class CharacterCounterTest {
    @Test(expected=IllegalArgumentException.class)
    public void testNullInput() {
        CharacterCounter.counterCharacters(null);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testStringInput() {

        Map<Character, Integer> map = CharacterCounter.counterCharacters("!a!A!");
        assertEquals(map.size(), 3);
        assertEquals(map.get('a').intValue(), 1);
        assertEquals(map.get('!').intValue(), 3);
        assertEquals(map.get('A').intValue(), 1);
    }

    @Test
    public void testEqual() {
        assertEquals(1,1);
    }

}