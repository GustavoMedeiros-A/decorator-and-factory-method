package factory_method;

public class GameFactory {
    public static IGame getGame(String game) {
        Class<?> cls = null;
        Object obj = null;
        try {
            cls = Class.forName("factory_method." + game);
            obj = cls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("nonexistent game");
        }
        if (!(obj instanceof IGame)) {
            throw new IllegalArgumentException("invalid game");
        }

        return (IGame) obj;
    }

}
