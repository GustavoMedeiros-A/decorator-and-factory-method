package factory_method;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class StrategyGameTest {
    @Test
    void shouldStartStrategy() {
        IGame strategy = GameFactory.getGame("StrategyGame");
        assertEquals("Start Strategy Game", strategy.start());
    }

    @Test
    void shouldPauseStrategy() {
        IGame strategy = GameFactory.getGame("StrategyGame");
        assertEquals("Stop Strategy Game", strategy.stop());
    }
}
