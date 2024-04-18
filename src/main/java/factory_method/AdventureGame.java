package factory_method;

public class AdventureGame implements IGame {
    public String start() {
        return "Start Adventure Game";
    }

    public String stop() {
        return "Stop Adventure Game";
    }
}
