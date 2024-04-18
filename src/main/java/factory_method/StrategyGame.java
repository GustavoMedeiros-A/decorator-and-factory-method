package factory_method;

public class StrategyGame implements IGame {
    public String start() {
        return "Start Strategy Game";
    }

    public String stop() {
        return "Stop Strategy Game";
    }
}
