package factory_method;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class AdventureGameTest {
    @Test
    void shouldStartAdventure() {
        IGame adventure = GameFactory.getGame("AdventureGame");
        assertEquals("Start Adventure Game", adventure.start());
    }

    @Test
    void shouldPauseAdventure() {
        IGame adventure = GameFactory.getGame("AdventureGame");
        assertEquals("Stop Adventure Game", adventure.stop());
    }
}
