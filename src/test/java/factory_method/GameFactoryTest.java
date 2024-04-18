package factory_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class GameFactoryTest {
    @Test
    void shouldReturnExceptionToNonexistentGame() {
        try {
            IGame game = GameFactory.getGame("IsNotAGame");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("nonexistent game", e.getMessage());
        }
    }

    @Test
    void shouldReturnExceptionToInvalidGame() {
        try {
            IGame game = GameFactory.getGame("Music");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("invalid game", e.getMessage());
        }
    }
}
